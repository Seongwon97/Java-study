package myPackage;
import java.util.Scanner;

public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int hour, minute;
		System.out.print("Enter the hour: ");
		hour = keyboard.nextInt();
		System.out.print("Enter the minute: ");
		minute = keyboard.nextInt();
		Time time = new Time(hour,minute);
		System.out.print("Time 12: ");
		System.out.println(time.getTime12());
		System.out.print("Time 24: ");
		System.out.println(time.getTime24());		


	}

}
