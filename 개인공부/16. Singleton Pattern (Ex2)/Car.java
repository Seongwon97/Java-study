package ch19;

public class Car {
	private static int serialNum = 10001;
	private int carNum;
	
	public Car() {
		carNum = serialNum;
		serialNum++;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	
}
