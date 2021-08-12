package mypackage;

import java.util.Scanner;

public class Ex1_2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two integers.");
		
		int n1,n2;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		System.out.println("The number of integers between two integers: ");
		System.out.println(n2 - n1 + 1);
		
	}

}
