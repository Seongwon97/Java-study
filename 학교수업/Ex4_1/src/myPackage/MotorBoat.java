package myPackage;

public class MotorBoat {
	public int capacityTank, amountTank;
	public int maxSpeed, currentSpeed;
	public int efficiency = 8;
	public int time;
	
	public int maxSpeedFeul() {
		int maxFeul= efficiency*maxSpeed*maxSpeed*time;
		return maxFeul;
	}
	public int currentSpeedFeul() {
		int currentFeul = efficiency*currentSpeed*currentSpeed*time;
		return currentFeul;
	}
	public int travelDistance() {
		int distance = currentSpeed*time;
		return  distance;
	}
	public double travelDistance2() {
		double distance2 = (double)amountTank/(double)(efficiency*currentSpeed); 
		return distance2; 
	}
}
