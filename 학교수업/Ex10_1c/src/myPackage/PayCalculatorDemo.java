package myPackage;
import java.util.Scanner;

public class PayCalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the regulay pay rate: ");
		int rate=keyboard.nextInt();
		RegularPay regularPay = new RegularPay(rate);
		System.out.print("Enter the regulay pay hours: ");
		double hour=keyboard.nextDouble();
        System.out.println(regularPay.computePay(hour));
        
		System.out.print("Enter the hazard pay rate: ");
		int rate2=keyboard.nextInt();
		HazardPay hazardPay = new HazardPay(rate2);
		System.out.print("Enter the hazard pay hours: ");
		double hour2=keyboard.nextDouble();
        System.out.println(hazardPay.computePay(hour2));
        
		
	}

}
