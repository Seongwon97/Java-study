package myPackage;
import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amountTank1, currentSpeed1;
		int time1;
		Scanner keyboard= new Scanner(System.in);
		MotorBoat boat1 = new MotorBoat();
		MotorBoat boat2 = new MotorBoat();
		System.out.println("The boat max speed is 80, and tank capacity is 60");
		System.out.print("Enter the time:  ");
		time1 = keyboard.nextInt();
		boat1.getTime();
		boat1.setTime(time1);
		System.out.print("Enter the amount of fuel in the tank:  ");
		amountTank1 = keyboard.nextDouble();
		boat1.getAmountTank();
		boat1.setAmountTank(amountTank1);
		System.out.print("Enter the currnet speed:  ");
		currentSpeed1 = keyboard.nextDouble();
		boat1.getCurrentSpeed();
		boat1.setCurrentSpeed(currentSpeed1);
		
		boat1.setMotorBoat(amountTank1, currentSpeed1, time1);
		System.out.println("The amount of fuel used at the maximum speed is "+boat1.maxSpeedFeul());
		System.out.println("The amount of fuel used at the current speed is "+boat1.currentSpeedFeul());
		System.out.println(time1+ " times, travel distance is "+ boat1.travelDistance());
		System.out.println("For current speed is " +currentSpeed1 + " and fuel amount " +amountTank1+ " , the travel distance is "+ boat1.travelDistance2());
		
		
		System.out.println("The boat max speed is 80, and tank capacity is 60");
		System.out.print("Enter the time:  ");
		time1 = keyboard.nextInt();
		boat2.getTime();
		boat2.setTime(time1);
		System.out.print("Enter the amount of fuel in the tank:  ");
		amountTank1 = keyboard.nextDouble();
		boat2.getAmountTank();
		boat2.setAmountTank(amountTank1);
		System.out.print("Enter the currnet speed:  ");
		currentSpeed1 = keyboard.nextDouble();
		boat2.getCurrentSpeed();
		boat2.setCurrentSpeed(currentSpeed1);
		
		boat2.setMotorBoat(amountTank1, currentSpeed1, time1);
		System.out.println("The amount of fuel used at the maximum speed is "+boat2.maxSpeedFeul());
		System.out.println("The amount of fuel used at the current speed is "+boat2.currentSpeedFeul());
		System.out.println(time1+ " times, travel distance is "+ boat2.travelDistance());
		System.out.println("For current speed is " +currentSpeed1 + " and fuel amount " +amountTank1+ " , the travel distance is "+ boat2.travelDistance2());
		System.out.println(boat1.equals(boat2)? ("Same") : ("Different"));
		
		}

}