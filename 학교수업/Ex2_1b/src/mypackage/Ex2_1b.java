package mypackage;
import java.util.Scanner;

public class Ex2_1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Fahrenheit=0;
		float Celsius=0;
		System.out.println("Enter the Fahrenheit: ");
		Scanner keyboard = new Scanner(System.in);
		Fahrenheit = keyboard.nextInt();
		Celsius=5 * (Fahrenheit - 32) / 9;
		System.out.println("The Celsius is "+Celsius);
	}

}
