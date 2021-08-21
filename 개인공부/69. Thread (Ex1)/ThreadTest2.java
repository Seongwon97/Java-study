package ch20;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for (i=1;i<=200;i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Thread.currentThread() + "start");
		
		/* Runnable을 사용하여 만든 Thread방법은 thread class를
		 * 상송받은 것이 아니기에 바로 start method를 사용할 수 없다.
		 * 그래서 아래와 같이 Runnable을 구현한 class를 통해
		 * runnable 인스턴스를 생성하고 해당 인스턴스를 통해 Thread 클래스를 생성해야한다.
		MyThread2 th1 = new MyThread2();
		th1.start();
		*/
		
		MyThread2 runnable = new MyThread2();
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "end");
		
		
		// Runnable은 아래와 같이 익명 객체로 바로 만들 수도 있다.
		// 간단하게 돌릴 경우 아래와 같이 할 수 있다.
		Runnable run = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("\nRun");
			}
			
		};
		run.run();
	}

}
