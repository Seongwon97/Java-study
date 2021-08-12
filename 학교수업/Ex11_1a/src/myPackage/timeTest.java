package myPackage;
import java.util.Scanner;

public class timeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
		String time1,time2;
		System.out.println("Time type : hh:mm am/pm");
		System.out.print("Enter the Time: ");
		time1 = keyboard.nextLine();
		System.out.print("Enter the Time: ");
		time2 = keyboard.nextLine();
		try {
			if(!InvalidTimeException.checkTime(time1))
				throw new InvalidTimeException();
			if(!InvalidTimeException.checkTime(time2))
				throw new InvalidTimeException();	
		}
		catch (Exception e) {
			System.out.println("wrong Time");
            System.exit(0);
        }
		System.out.println(time1);
		System.out.println(time2);
	}
	

}
