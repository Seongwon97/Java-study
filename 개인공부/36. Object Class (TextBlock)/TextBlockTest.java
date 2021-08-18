package ch03;

public class TextBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// """사이에 쓰고 싶은대로 쓰면 된다.(줄바꿈도 다 적용된다.)
		String strBlock = """
				This 
				is 
				text
				block
				test.""";
		System.out.println(strBlock);
		
		System.out.println(getBlockOfHtml());

	}
	
	// html도 쉽게 사용가능하다.
	public static String getBlockOfHtml() {
	    return """
	            <html>

	                <body>
	                    <span>example text</span>
	                </body>
	            </html>""";
	
}


}
