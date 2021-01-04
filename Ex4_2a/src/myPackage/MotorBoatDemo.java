package myPackage;
import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amountTank1, currentSpeed1;
		int time1;
		Scanner keyboard= new Scanner(System.in);
		MotorBoat boat = new MotorBoat();
		System.out.println("The boat max speed is 80, and tank capacity is 60");
		System.out.print("Enter the time:  ");
		time1 = keyboard.nextInt();
		boat.getTime();
		boat.setTime(time1);
		System.out.print("Enter the amount of fuel in the tank:  ");
		amountTank1 = keyboard.nextDouble();
		boat.getAmountTank();
		boat.setAmountTank(amountTank1);
		System.out.print("Enter the currnet speed:  ");
		currentSpeed1 = keyboard.nextDouble();
		boat.getCurrentSpeed();
		boat.setCurrentSpeed(currentSpeed1);
		
		boat.setMotorBoat(amountTank1, currentSpeed1, time1);
		System.out.println("The amount of fuel used at the maximum speed is "+boat.maxSpeedFeul());
		System.out.println("The amount of fuel used at the current speed is "+boat.currentSpeedFeul());
		System.out.println(time1+ " times, travel distance is "+ boat.travelDistance());
		System.out.println("For current speed is " +currentSpeed1 + " and fuel amount " +amountTank1+ " , the travel distance is "+ boat.travelDistance2());
		
	}

}