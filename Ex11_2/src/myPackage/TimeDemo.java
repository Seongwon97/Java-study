package myPackage;
import java.util.Scanner;

public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		TimeDemo timeDemo = new TimeDemo();
		char yn;
		do {
			timeDemo.doIt();
            System.out.println("Again? (y/n)");
            yn = keyboard.next().charAt(0);

        }while (yn == 'y');
	}
	public void doIt() {
		int hourI,minuteI;
		String hour,minute;
		try {
			Scanner keyboard= new Scanner(System.in);
			System.out.println("Enter time in 24-hour notation:");
			String time=keyboard.nextLine();
			hour=time.substring(0,time.indexOf(':'));
			minute=time.substring(time.indexOf(':')+1);
			hourI=Integer.parseInt(hour);
			minuteI=Integer.parseInt(minute);
			if(hourI>23)
				throw new TimeFormatException();
			if (minuteI>59)
				throw new TimeFormatException();
			if((hourI>=12)&&(hourI<24)) {
				hourI=hourI-12;
				System.out.println("That is the same as ");
				System.out.println(hourI+":"+minuteI+"PM");
			}
			else {
				System.out.println("That is the same as ");
				System.out.println(hourI+":"+minuteI+"AM");
			}
		}catch(TimeFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
