package myPackage;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Test {
	public static void main(String[] args) throws IOException, ParseException {
		String inTime = new java.text.SimpleDateFormat("HHmm").format(new java.util.Date());
		int temp;
		String apiUrl = "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData";
		// 홈페이지에서 받은 키
		String serviceKey = "0zvHHyON6oVWMJnkW4pNm4QKn4zGCMJRDHbNFrkw%2BuyHzHm3%2BXAGjWmP5ZCgrKz4Em%2B1L6pHiGwfNbJ9IorYkA%3D%3D";
		//serviceKey키
		String nx = "37"; //위도
		String ny = "127"; //경도
		String baseDate = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date()); //조회하고싶은 날짜
		String baseTime = ""; //조회하고싶은 시간
		String type = "json"; //json타입으로 한다.

		temp=Integer.parseInt(inTime);//string type의 현재 시간을  int형으로 변경
		if ((00 <= temp) && (temp <= 130)){
			//날씨정보가 3시간 간격으로 데이터가 나와서 그에 따라 baseTime을 정해준다
			//현재 시간에서 가장 가까운 시간대의 날씨 예보를 받기 위해 시간을 나누고 중간시간에서 4시간 전의 시간으로 setting한다.
			baseTime = "2000";
			Calendar cal = new GregorianCalendar();
			cal.add(Calendar.DATE, -1);//전날 21시로 맞춰야해서 하루를 더 뺀다.
			baseDate="";
			baseDate=baseDate.concat(Integer.toString(cal.get(Calendar.YEAR)));
			if((cal.get(Calendar.MONTH) + 1)<10) {
				baseDate=baseDate.concat("0");
				//ex) 5월이면 05가 아닌 5로 출력되어서 10이하는 앞에 먼저 0을 붙여준다.
			}
			baseDate=baseDate.concat(Integer.toString(cal.get(Calendar.MONTH) + 1));
			if((cal.get(Calendar.DAY_OF_MONTH))<10) {
				baseDate=baseDate.concat("0");
			}
			baseDate=baseDate.concat(Integer.toString(cal.get(Calendar.DAY_OF_MONTH)));
		}
		else if ((130< temp) && (temp <= 430)){
			baseTime = "2300";
			Calendar cal = new GregorianCalendar();
			cal.add(Calendar.DATE, -1);//전날 23시로 맞춰야해서 하루를 더 뺀다.
			baseDate="";
			baseDate=baseDate.concat(Integer.toString(cal.get(Calendar.YEAR)));
			if((cal.get(Calendar.MONTH) + 1)<10) {
				baseDate=baseDate.concat("0");
				//ex) 5월이면 05가 아닌 5로 출력되어서 10이하는 앞에 먼저 0을 붙여준다.
			}
			baseDate=baseDate.concat(Integer.toString(cal.get(Calendar.MONTH) + 1));
			if((cal.get(Calendar.DAY_OF_MONTH))<10) {
				baseDate=baseDate.concat("0");
			}
			baseDate=baseDate.concat(Integer.toString(cal.get(Calendar.DAY_OF_MONTH)));
		}
		else if ((430 < temp) && (temp <= 730)){
			baseTime = "0200";
		}
		else if ((730 < temp) && (temp <= 1030)){
			baseTime = "0500";
		}
		else if ((1030 < temp) && (temp <= 1330)){
			baseTime = "0800";
		}
		else if ((1330 < temp) && (temp <= 1630)){
			baseTime = "1100";
		}
		else if ((1630 < temp) && (temp <= 1930)){
			baseTime = "1400";
		}
		else if ((1930 < temp) && (temp <= 2230)){
			baseTime = "1700";
		}
		else if ((2230 < temp) && (temp <= 2359)){
			baseTime = "2000";
		}
		
		StringBuilder urlBuilder = new StringBuilder(apiUrl);
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "="+serviceKey);
		urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode(nx, "UTF-8")); //경도
		urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode(ny, "UTF-8")); //위도
		urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(baseDate, "UTF-8")); /* 조회하고싶은 날짜*/
		urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode(baseTime, "UTF-8")); /* 조회하고싶은 시간 AM 02시부터 3시간 단위 */
		urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode(type, "UTF-8")); /* 타입 */
		/*
		* GET방식으로 전송해서 파라미터 받아오기
		*/
		URL url = new URL(urlBuilder.toString());
		//urlBuilder을 이용하여 URL 객체를 만들어준다.
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//url 객체를 사용하여 HttpURLConnection객체를 만들어준다.
		conn.setRequestMethod("GET");//모든 item을 받아온다.
		conn.setRequestProperty("Content-type", "application/json");
		
		//System.out.println("Response code: " + conn.getResponseCode());
		
		BufferedReader rd;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} 
		else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		String result= sb.toString();
		
		System.out.println("가천대 날씨");
		
		JSONParser parser = new JSONParser(); 
		//parsing을 하기위한 JSONParser객체를 만들어준다.
		JSONObject jsonObject = (JSONObject) parser.parse(result); 
		JSONObject response = (JSONObject) jsonObject.get("response"); 
		// response를 이용하여 object를 response로 나눈다.
		JSONObject body = (JSONObject) response.get("body"); 
		// body를 이용하여 response를 body로 나눈다.
		JSONObject items = (JSONObject) body.get("items");
		// items를 이용하여 body를 items로 나눈다.
		JSONArray item = (JSONArray) items.get("item");
		//item에 대한 배열을 만든다.
		String category;//날씨 정보에 대한 sematic
		int print=0;
		for(int i = 0 ; i < item.size(); i++) {
			JSONObject dataSet = (JSONObject) item.get(i);
			Object fcstValue = dataSet.get("fcstValue");//fcstValue변수를 이용하여
			Object fcstDate = dataSet.get("fcstDate");//fcstDate변수를 이용하여 예측일자를 구한다
			Object fcstTime = dataSet.get("fcstTime");//fcstTime변수를 이용하여 예측시간을 구한다
			category = (String)dataSet.get("category"); //category변수를 이용하여 sematic을 받는다.
			
			
			if(print==0) {
				System.out.println("  예측일자: "+fcstDate+"\n  예측시간: "+fcstTime);
				print++;
			}
			switch(category) {//각각의 sematic에 따라서 출력을 다르게 해준다.
				case "POP":
					System.out.println("  강수확률 : "+fcstValue+"%");
					break;
				case "PTY":
					System.out.println("  강수형태 : "+fcstValue); 
					break;
				case "R06":
					System.out.println(" 6시간 강수량 범주 : "+fcstValue + " mm");
					break;
				case "REH":
					System.out.println("  습도 : "+fcstValue+"%");
					break;
				case "S06":
					System.out.println(" 6시간 신설적 범주 : "+fcstValue+" cm");
					break;
				case "SKY":
					System.out.println("  하늘 상태 : "+fcstValue);
					break;
				case "T3H":
					System.out.println(" 3시간 기온 : "+fcstValue + " C");
					break;
				case "TMN":
					System.out.println("  아침 최저기온 : "+fcstValue + " C");
					break;		
				case "TMX":
					System.out.println("  낮 최고기온 : "+fcstValue+ " C");
					break;
				case "UUU":
					System.out.println("  풍속(동서성분) : "+fcstValue + " m/s");
					break;
				case "VVV":
					System.out.println("  풍속(남북성분) : "+fcstValue + " m/s");
					break;
				}
			}	
		/*
		* POP 강수확률 %
		* PTY 강수형태 코드값
		* R06 6시간 강수량 범주 (1 mm)
		* REH 습도 %
		* S06 6시간 신적설 범주(1 cm)
		* SKY 하늘상태 코드값
		* T3H 3시간 기온 ℃
		* TMN 아침 최저기온 ℃
		* TMX 낮 최고기온 ℃
		* UUU 풍속(동서성분) m/s
		* VVV 풍속(남북성분) m/s
		*/
		}
}