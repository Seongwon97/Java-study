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
		// Ȩ���������� ���� Ű
		String serviceKey = "0zvHHyON6oVWMJnkW4pNm4QKn4zGCMJRDHbNFrkw%2BuyHzHm3%2BXAGjWmP5ZCgrKz4Em%2B1L6pHiGwfNbJ9IorYkA%3D%3D";
		//serviceKeyŰ
		String nx = "37"; //����
		String ny = "127"; //�浵
		String baseDate = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date()); //��ȸ�ϰ���� ��¥
		String baseTime = ""; //��ȸ�ϰ���� �ð�
		String type = "json"; //jsonŸ������ �Ѵ�.

		temp=Integer.parseInt(inTime);//string type�� ���� �ð���  int������ ����
		if ((00 <= temp) && (temp <= 130)){
			//���������� 3�ð� �������� �����Ͱ� ���ͼ� �׿� ���� baseTime�� �����ش�
			//���� �ð����� ���� ����� �ð����� ���� ������ �ޱ� ���� �ð��� ������ �߰��ð����� 4�ð� ���� �ð����� setting�Ѵ�.
			baseTime = "2000";
			Calendar cal = new GregorianCalendar();
			cal.add(Calendar.DATE, -1);//���� 21�÷� ������ؼ� �Ϸ縦 �� ����.
			baseDate="";
			baseDate=baseDate.concat(Integer.toString(cal.get(Calendar.YEAR)));
			if((cal.get(Calendar.MONTH) + 1)<10) {
				baseDate=baseDate.concat("0");
				//ex) 5���̸� 05�� �ƴ� 5�� ��µǾ 10���ϴ� �տ� ���� 0�� �ٿ��ش�.
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
			cal.add(Calendar.DATE, -1);//���� 23�÷� ������ؼ� �Ϸ縦 �� ����.
			baseDate="";
			baseDate=baseDate.concat(Integer.toString(cal.get(Calendar.YEAR)));
			if((cal.get(Calendar.MONTH) + 1)<10) {
				baseDate=baseDate.concat("0");
				//ex) 5���̸� 05�� �ƴ� 5�� ��µǾ 10���ϴ� �տ� ���� 0�� �ٿ��ش�.
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
		urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode(nx, "UTF-8")); //�浵
		urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode(ny, "UTF-8")); //����
		urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(baseDate, "UTF-8")); /* ��ȸ�ϰ���� ��¥*/
		urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode(baseTime, "UTF-8")); /* ��ȸ�ϰ���� �ð� AM 02�ú��� 3�ð� ���� */
		urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode(type, "UTF-8")); /* Ÿ�� */
		/*
		* GET������� �����ؼ� �Ķ���� �޾ƿ���
		*/
		URL url = new URL(urlBuilder.toString());
		//urlBuilder�� �̿��Ͽ� URL ��ü�� ������ش�.
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//url ��ü�� ����Ͽ� HttpURLConnection��ü�� ������ش�.
		conn.setRequestMethod("GET");//��� item�� �޾ƿ´�.
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
		
		System.out.println("��õ�� ����");
		
		JSONParser parser = new JSONParser(); 
		//parsing�� �ϱ����� JSONParser��ü�� ������ش�.
		JSONObject jsonObject = (JSONObject) parser.parse(result); 
		JSONObject response = (JSONObject) jsonObject.get("response"); 
		// response�� �̿��Ͽ� object�� response�� ������.
		JSONObject body = (JSONObject) response.get("body"); 
		// body�� �̿��Ͽ� response�� body�� ������.
		JSONObject items = (JSONObject) body.get("items");
		// items�� �̿��Ͽ� body�� items�� ������.
		JSONArray item = (JSONArray) items.get("item");
		//item�� ���� �迭�� �����.
		String category;//���� ������ ���� sematic
		int print=0;
		for(int i = 0 ; i < item.size(); i++) {
			JSONObject dataSet = (JSONObject) item.get(i);
			Object fcstValue = dataSet.get("fcstValue");//fcstValue������ �̿��Ͽ�
			Object fcstDate = dataSet.get("fcstDate");//fcstDate������ �̿��Ͽ� �������ڸ� ���Ѵ�
			Object fcstTime = dataSet.get("fcstTime");//fcstTime������ �̿��Ͽ� �����ð��� ���Ѵ�
			category = (String)dataSet.get("category"); //category������ �̿��Ͽ� sematic�� �޴´�.
			
			
			if(print==0) {
				System.out.println("  ��������: "+fcstDate+"\n  �����ð�: "+fcstTime);
				print++;
			}
			switch(category) {//������ sematic�� ���� ����� �ٸ��� ���ش�.
				case "POP":
					System.out.println("  ����Ȯ�� : "+fcstValue+"%");
					break;
				case "PTY":
					System.out.println("  �������� : "+fcstValue); 
					break;
				case "R06":
					System.out.println(" 6�ð� ������ ���� : "+fcstValue + " mm");
					break;
				case "REH":
					System.out.println("  ���� : "+fcstValue+"%");
					break;
				case "S06":
					System.out.println(" 6�ð� �ż��� ���� : "+fcstValue+" cm");
					break;
				case "SKY":
					System.out.println("  �ϴ� ���� : "+fcstValue);
					break;
				case "T3H":
					System.out.println(" 3�ð� ��� : "+fcstValue + " C");
					break;
				case "TMN":
					System.out.println("  ��ħ ������� : "+fcstValue + " C");
					break;		
				case "TMX":
					System.out.println("  �� �ְ��� : "+fcstValue+ " C");
					break;
				case "UUU":
					System.out.println("  ǳ��(��������) : "+fcstValue + " m/s");
					break;
				case "VVV":
					System.out.println("  ǳ��(���ϼ���) : "+fcstValue + " m/s");
					break;
				}
			}	
		/*
		* POP ����Ȯ�� %
		* PTY �������� �ڵ尪
		* R06 6�ð� ������ ���� (1 mm)
		* REH ���� %
		* S06 6�ð� ������ ����(1 cm)
		* SKY �ϴû��� �ڵ尪
		* T3H 3�ð� ��� ��
		* TMN ��ħ ������� ��
		* TMX �� �ְ��� ��
		* UUU ǳ��(��������) m/s
		* VVV ǳ��(���ϼ���) m/s
		*/
		}
}