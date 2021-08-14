package ch15;

public class Person {
	String name;
	int money;
	
	public Person (String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi, int cost) {
		taxi.take(cost);
		this.money -= cost;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money +"원 입니다.");
	}
}
