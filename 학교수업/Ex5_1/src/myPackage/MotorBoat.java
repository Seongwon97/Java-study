package myPackage;

public class MotorBoat {
	public static final double capacityTank = 60.0;
	public static final double maxSpeed = 80.0;
	private double amountTank, currentSpeed;
	private double efficiency = 8.0;
	private int time;
	
	public double getAmountTank() {
		return amountTank;
	}
	public void setAmountTank(double newAmountTank) {
		if((newAmountTank >= 0)&&(newAmountTank < 60))
			amountTank = newAmountTank;
		else {
			System.out.println("Worng amount of tank: "+ newAmountTank);
			System.exit(0);
		}
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(double newCurrentSpeed) {
		if((newCurrentSpeed >= 0) && (newCurrentSpeed < 80))
			currentSpeed = newCurrentSpeed;
		else {
			System.out.println("Worng current speed: "+ newCurrentSpeed);
			System.exit(0);
		}
	}
	public int getTime() {
		return time;
	}
	public void setTime(int newTime) {
		if(newTime >= 0)
			time = newTime;
		else {
			System.out.println("Worng time: "+ newTime);
			System.exit(0);
		}
	}

	public void setMotorBoat(double newAmountTank, double newCurrentSpeed, int newTime) {
		amountTank = newAmountTank;
		currentSpeed = newCurrentSpeed;
		time = newTime;
		
	}
	
	public double maxSpeedFeul() {
		double maxFeul= efficiency*maxSpeed*maxSpeed*time;
		return maxFeul;
	}
	public double currentSpeedFeul() {
		double currentFeul = efficiency*currentSpeed*currentSpeed*time;
		return currentFeul;
	}
	public double travelDistance() {
		double distance = currentSpeed*time;
		return  distance;
	}
	public double travelDistance2() {
		double distance2 = amountTank/(efficiency*currentSpeed); 
		return distance2; 
	}
    public boolean equals(MotorBoat newBoat) {
        return this.amountTank == newBoat.amountTank &&
            this.currentSpeed == newBoat.currentSpeed &&
            this.time == newBoat.time;
    }
}
