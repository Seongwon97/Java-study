package ch11;

public class MakeReport {

	StringBuffer buffer = new StringBuffer();
	// 문자열이 긴 문자열을 만들때는 StringBuffer를 자주 사용한다.
	// ~~~ + ~~~ + ~~식으로 하는 것보다 효율적이다.
	
	private String line = "===========================================\n";
	private String title = "  이름\t   주소 \t\t  전화번호  \n";
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	
	private void makeFooter()
	{
		
		buffer.append(line);
	}
	
	// 위에 makeFooter, generateBody, makeHeader같은 경우는 private으로 구현하여
	// client에게 제공을 하지 않고 client에게는 getReport만 제공을 한다.
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
