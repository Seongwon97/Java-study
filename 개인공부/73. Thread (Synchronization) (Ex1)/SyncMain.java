package ch22;


class Bank{
	private int money = 1000;

	public void saveMoney(int save) {
		int m = getMoney();
		
		try {
			// 3초간 중지
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m+save);
	}
	
	public void minusMoney(int minus) {
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
		
		// 잘못 짠 코드의 예시 - sleep이 saveMoney가 되는 3000보다 작을 때는 동기화가 안된다.
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
