package myPackage;
import java.util.Scanner;

public class Ex3_1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money, charge;
		System.out.println("Enter your money");
		Scanner keyboard = new Scanner(System.in);
		money= keyboard.nextInt();
		if(money < 10)
			System.out.println("Charge is $1");
		else if(money < 100) {
			charge = (int)(money/10);
			System.out.println("Charge is $" + charge);
		}
		else if(money < 1000) {
			charge = 5 + (int)(money/20);
			System.out.println("Charge is $" + charge);
		}
		else {
			charge = 40 + (int)(money/100);
			System.out.println("Charge is $" + charge);
		}
	}
}
