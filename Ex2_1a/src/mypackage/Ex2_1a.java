package mypackage;
import java.util.Scanner;

public class Ex2_1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fourDigit;
		int digit1=0, digit2=0,digit3=0,digit4=0;
		System.out.println("Enter the four-digit integer: ");
		Scanner keyboard = new Scanner(System.in);
		fourDigit = keyboard.nextInt();
		digit1=fourDigit/1000;
		digit2=(fourDigit%1000)/100;
		digit3=(fourDigit%100)/10;
		digit4=(fourDigit%10);
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);
	}

}
