package ch22_1;


class Bank{
	private int money = 1000;

	// synchronized 붙이면 해당 method가 수행되는 동안
	// method에서 사용하는 객체들에 lock을 걸어 접근 못하게 할 수 있다.
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		
		try {
			// 3초간 중지
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m+save);
		
		/* Synchronized method를 만들지 않아도 아래와 같이 해당 code들을
		 * lock을 걸어줄 수도 있다.
		synchronized (this) {
		// 괄호에는 어떤 resource에다가 sync를 걸 건지 적으면 된다.
			int m = getMoney();
			
			try {
				// 3초간 중지
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			setMoney(m+save);
		}*/
	}
	
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		
		try {
			// 0.2초간 중지
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace(); 
		}
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

// 돈을 저축하는 사람
class Park extends Thread {
	public void run() {
		// synchronized (SyncMain.myBank)
		System.out.println("Start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) : "+ SyncMain.myBank.getMoney());
	}
}

//돈을 쓰는 사람
class ParkWife extends Thread {
	public void run() {
		System.out.println("Start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000) : "+ SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	// shared resource로 사용하기 위해 public static으로 생성
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		
		Park p = new Park();
		p.start();
		
		// 위에서 synchronized가 되어서 sleep이 200임에도 불구하고 동기화가 지켜진다.
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start();
		
	}
}
