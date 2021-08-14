package ch15;

public class TakeTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person edward = new Person("Edward", 20000);
		
		Taxi taxi1 = new Taxi("잘 간다 운수 택시");
		
		edward.takeTaxi(taxi1, 10000);
		
		edward.showInfo();
		taxi1.showTaxiInfo();
	}

}
