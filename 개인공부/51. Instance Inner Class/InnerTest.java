package ch01;

class OutClass {
	private int num=10;
	private static int sNum =20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	// 내부 인스턴스
	// inner class는 주로 private로 구현
	private class InClass{
		int iNum = 100;
		
		//static int sInClass = 500;
		// inner class는 일반적으로 outer class가 생성이 된 후애 생성이된다.
		// 그래서 class생성전에 먼저 공간을 잡는 static 변수는 inner class에서 사용이 불가하다.
		
		void inTest(){
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}

	}
	
	public void usingClass() {
		inClass.inTest();
		// inner class내에 있는 method사용 예시
	}
}
public class InnerTest {
	public static void main(String args[]) {
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		/*// inner class가 private로 만들지 않으면 아래와 같이 바로 사용도 가능
		OutClass.InClass inner = outClass.new InClass();
		inner.inTest();
		*/
	}
}
