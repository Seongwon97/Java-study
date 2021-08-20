package ch01_1;

class OutClass {
	private int num=10;
	private static int sNum =20;

	
	// 정적 내부 클래스
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 1200;
		
		void inTest(){
			// 내부 인스턴스와 다르게 정적 내부 클래스는 static으로 만들어 진 것이라 외부 클래스의 
			// 인스턴스 생성 여부에 상관없이 생성이 된다.
			// 그래서 외부 인스턴스의 일반 인스턴스 변수는 정적 내부 클래스에서 사용이 불가능하다.
			//System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("InStaticClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수 사용)"); 
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}
		static void sTest(){  // 정적 클래스의 static 메서드			
			// 정적 클래스의 static 메서드에서는 내부 클래스의 인스턴스 변수도 사용할 수 없음 (외부 클래스의 인스턴스 변수도 사용할 수 없음.)
			// System.out.println("InStaticClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수 사용)"); 
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			
		}

	}
}
public class InnerTest2 {
	public static void main(String args[]) {
		// 인스턴스 inner class와 다르게 정적 inner class는 바로 생성 가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println("\n정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.InStaticClass.sTest();
		// 정적 내부 클래스의 static 메소드는 바로 호출 가능하다.

	}
}
