package ch10;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("=============");
		Car mCar = new ManualCar();
		mCar.run();
	}

}
