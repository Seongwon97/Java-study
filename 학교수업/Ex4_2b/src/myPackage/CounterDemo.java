package myPackage;
import java.util.Scanner;

public class CounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String choice;
		Counter counter1 = new Counter();
		int i = 1;
		while(i>0) {
		System.out.print("Enter the your choice(Increase or Decrease), \nif you exit the program enter incorrect: ");
		choice = keyboard.nextLine();
		counter1.getChoice();
		counter1.setChoice(choice);
		counter1.setCounter(choice);
		System.out.println("Current counter is "+counter1.Check()+"\n");
		}
	}

}
