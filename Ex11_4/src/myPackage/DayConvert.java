package myPackage;
import java.util.Scanner;

public class DayConvert {

	private static String[] monthN = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		DayConvert convert = new DayConvert();
		char yn;
		do {
			convert.doIt();
            System.out.println("Again? (y/n)");
            yn = keyboard.next().charAt(0);

        }while (yn == 'y');
	}
	public void doIt() {
		int monthI,dayI;
		String month,day;
		try {
			Scanner keyboard= new Scanner(System.in);
			System.out.println("Enter day");
			String date=keyboard.nextLine();
			month=date.substring(0,date.indexOf('/'));
			day=date.substring(date.indexOf('/')+1);
			monthI=Integer.parseInt(month);
			dayI=Integer.parseInt(day);
			if((monthI>12)||(monthI<1))
				throw new MonthException();
			if(monthI==1)
				if((dayI>31)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[0]+" "+dayI);
				}
			if(monthI==2)
				if((dayI>28)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[1]+" "+dayI);
				}
			if(monthI==3)
				if((dayI>31)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[2]+" "+dayI);
				}
			if(monthI==4)
				if((dayI>30)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[3]+" "+dayI);
				}
			if(monthI==5)
				if((dayI>31)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[4]+" "+dayI);
				}
			if(monthI==6)
				if((dayI>30)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[5]+" "+dayI);
				}
			if(monthI==7)
				if((dayI>31)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[6]+" "+dayI);
				}
			if(monthI==8)
				if((dayI>31)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[7]+" "+dayI);
				}
			if(monthI==9)
				if((dayI>30)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[8]+" "+dayI);
				}
			if(monthI==10)
				if((dayI>30)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[9]+" "+dayI);
				}
			if(monthI==11)
				if((dayI>30)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[10]+" "+dayI);
				}
			if(monthI==12)
				if((dayI>31)||(dayI<1))
					throw new DayException();
				else {
					System.out.println("That is the same as ");
					System.out.println(monthN[11]+" "+dayI);
				}
		}catch(MonthException e) {
			System.out.println(e.getMessage());
		}
		catch(DayException e) {
			System.out.println(e.getMessage());
		}
	}
}
