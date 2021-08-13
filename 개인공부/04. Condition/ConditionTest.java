package ch13;

import java.util.Scanner;
public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max;
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("입력1: ");
		int num1 = scanner.nextInt();
		System.out.print("입력1: ");
		int num2 = scanner.nextInt();

		max = (num1 > num2)? num1: num2;
		System.out.println("Max: "+ max);
	}

}
