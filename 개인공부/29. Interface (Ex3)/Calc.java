package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
	// default method는 위의 method와는 다르게 이 interface를 implement하는 클래스에서
	// 꼭 재정의를 하지 않아도 사용가능하다. (원하면 재정의도 가능)
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod(); 
		myStaticMethod();
		// default method에서는 private메서드를 기본, static둘 다 호출 가능하다.
	}
	
	
	
	// interface에서 static으로 생성한 method는 인스턴스 없이 사용 가능하다!!
	static int total(int[] arr) {
		int total = 0;
		for (int num: arr) {
			total += num;

		}
		//myMethod(); 
		myStaticMethod();
		// static method에서 private method를 호출할때는 private static만 호출가능하다.
		return total;
	}
	
	
	// private method는 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음
	// 인터페이스 내부에서만 사용하기 위해 구현하는 메서드
	// default 메서드나 static 메서드에서 사용함
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("my Static Method");
	}
}
