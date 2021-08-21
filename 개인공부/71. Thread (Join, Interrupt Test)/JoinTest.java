package ch21;

public class JoinTest extends Thread{
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	
	public void run() {
		int i;
		for (i = start; i < end; i++) {
			total += i;
		}
	}
	
	
	
	public static void main(String[] args) {
		JoinTest jt1 = new JoinTest(1,50);
		JoinTest jt2 = new JoinTest(51,100);
		
		/* 이렇게 join을 하지 않는 경우 print를 하는 순간 결과가 다 안나온 상태라
		 * 실행을 할때마다 값이 달라지고 0이라는 결과가 나오기도 한다.
		jt1.start();
		jt2.start();
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal);
		 */
		
		jt1.start();
		jt2.start();
		
		// join을 하면 해당 thread의 작업이 끝날때까지 
		// 다른 Thread(여기서는 main)이 non-runnable상태로 다음 작업을 기다려야한다.
		// 작업이 끝나면 main을 꺠우기 위해 interruptException을 통해 깨운다.
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal);
		
	}
}
