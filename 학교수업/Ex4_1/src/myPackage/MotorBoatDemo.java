package myPackage;
import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		MotorBoat boat = new MotorBoat();
		System.out.print("Enter the time:  ");
		boat.time = keyboard.nextInt();
		System.out.print("Enter the Capacity of fuel tank:  ");
		boat.capacityTank = keyboard.nextInt();
		System.out.print("Enter the amount of fuel in the tank:  ");
		boat.amountTank = keyboard.nextInt();
		System.out.print("Enter the currnet speed:  ");
		boat.currentSpeed = keyboard.nextInt();
		System.out.print("Enter the maxspeed:  ");
		boat.maxSpeed = keyboard.nextInt();
		
		System.out.println("The amount of fuel used at the maximum speed is "+boat.maxSpeedFeul());
		System.out.println("The amount of fuel used at the current speed is "+boat.currentSpeedFeul());
		System.out.println(boat.time+ " times, travel distance is "+ boat.travelDistance());
		System.out.println("For current speed is " +boat.currentSpeed + " and fuel amount " +boat.amountTank+ " , the travel distance is "+ boat.travelDistance2());
		
	}

}