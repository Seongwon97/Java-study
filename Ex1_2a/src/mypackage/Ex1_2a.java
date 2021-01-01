package mypackage;
import java.util.Scanner;

public class Ex1_2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your birth year!");
		int age;
		
		Scanner keyboard = new Scanner(System.in);
		age = keyboard.nextInt();
		
		System.out.println("Your age: ");
		System.out.println(2020 - age);
	}

}
