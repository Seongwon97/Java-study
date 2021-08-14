package ch15;

public class Taxi {
	String companyName;
	int money;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int cost) {
		this.money += cost;
	}
	
	public void showTaxiInfo() {
		System.out.println(companyName + "수입은 "+ money + "원 입니다.");
	}
}
