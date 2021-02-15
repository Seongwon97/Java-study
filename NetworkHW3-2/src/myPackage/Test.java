package myPackage;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.Calendar;
public class Test {
	public static void main(String[] args) throws IOException, ParseException {
		String apiURL= "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/"
                + "searchDailyBoxOfficeList.json"
                + "?key=a2c44803648404dbab9ac994ab6d9bcb"
                + "&targetDt=";
		//영화진흥 위원회의 openAPI의 주소와 key를 이용하여 apiURL을 만든다.
		
		Calendar cal = new GregorianCalendar();
		//일별 박스오피스 조회는 당일 날짜로는 안되고 이전의 날짜로만 가능해서 어제의 날짜를 구해준다.
		cal.add(Calendar.DATE, -1);//어제의 날짜를 구하는거라 -1을 해준다
		String date="";
		date=date.concat(Integer.toString(cal.get(Calendar.YEAR)));
		if((cal.get(Calendar.MONTH) + 1)<10) {
			date=date.concat("0");//ex) 5월이면 05가 아닌 5로 출력되어서 10이하는 앞에 먼저 0을 붙여준다.
		}
		date=date.concat(Integer.toString(cal.get(Calendar.MONTH) + 1));
		if((cal.get(Calendar.DAY_OF_MONTH))<10) {
		date=date.concat("0");
		}
		date=date.concat(Integer.toString(cal.get(Calendar.DAY_OF_MONTH)));	
		apiURL=apiURL.concat(date);//date에 저장된 어제의 날짜를 apiURL에 이어서 붙여준다.
		URL url = new URL(apiURL); //apiURL을 이용하여 URL 객체를 만들어준다.
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//url 객체를 사용하여 HttpURLConnection객체를 만들어준다.
		conn.setRequestMethod("GET");//모든 item을 받아온다.
		//System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		String result= sb.toString();
	
		//System.out.println(result);
		
		JSONParser parser = new JSONParser();//parsing을 하기위한 JSONParser객체를 만들어준다.
        JSONObject jsonObject = (JSONObject)parser.parse(result);
        JSONObject boxOfficeResult =  (JSONObject) jsonObject.get("boxOfficeResult");
        //boxOfficeResult를 이용하여 parsing해준다.
        JSONArray dailyBoxOfficeList = (JSONArray)boxOfficeResult.get("dailyBoxOfficeList");
        //dailyBoxOfficeList배열을 만든다.
        for(int i = 0 ; i < dailyBoxOfficeList.size(); i++){
        	//dailyBoxOfficeList의 크기만큼 배열을 돌리며 각각의 변수를 이용하여 결과값들을 받는다.
            JSONObject dataSet = (JSONObject)dailyBoxOfficeList.get(i);
            String movieNm = (String) dataSet.get("movieNm");//movieNm변수를 사용하여 영화이름을 받는다.
            String openDt = (String) dataSet.get("openDt");//openDt변수를 아용하여 개봉일을 받는다.
            String rank = (String) dataSet.get("rank");//rank변수를 이용하여 랭킹을 받는다.
            String audiAcc = (String) dataSet.get("audiAcc");//audiAcc변수를 이용하여 누적 관객수를 받는다.
            String salesAcc = (String) dataSet.get("salesAcc");//salesAcc변수를 이용하여 누적 매출액을 받는다.
            String audiCnt = (String) dataSet.get("audiCnt");//audiCnt변수를 이용하여 해당일 관객 수를 받는다
            System.out.println(movieNm+"\n  순위: "+rank+"\n  개봉일: "+openDt+"\n  당일 관객수: "+audiCnt);
            System.out.println("  누적 관객수: "+audiAcc+"\n  누적 매출액: "+salesAcc+"\n\n");
            //결과값들을 출력해준다.
        }
	}
}