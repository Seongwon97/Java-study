package ch20;

class MyThread extends Thread {
	//run은 thread가 실행되면 불리는 함수이다.
	public void run() {
		int i;
		for (i=1;i<=200;i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread() + "start");
		// Thread.currentThread()의 결과인 Thread[main,5,main]은
		// 첫번째 main은 thread를 호출한 함수를 의미하며 (여기서는 main함수)
		// 두번째 5는 priority, 세번째는 해당 thread가 속해있는 위치를 의미한다.
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		
		// thread class는 start()메소드 실행하면 thread가 실행된다.
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
	}

}
