package ch02;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		// 매개변수 i는 매서드가 호출될 때 stack memory에 생성이 된다.
		int num = 10;
		
		class MyRunnable implements Runnable {
			
			int localNum = 1000;	
			
			@Override
			public void run() {
				//num = 200;
				//i = 100;
				// 지역변수와 메서드의 매개변수는 내부클래스에게는 상수로 잡혀서 읽기만 가능하고 변경은 불가하다. (final로 잡힘)
				// 내부 class의 method는 일을 수행하고나면 사라지는데 외부의 지역변수와 매게변수는 계속 stack에 남아있어서 변경이 불가하다. 
				
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");

			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerClass {
	public static void main(String args[]) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
