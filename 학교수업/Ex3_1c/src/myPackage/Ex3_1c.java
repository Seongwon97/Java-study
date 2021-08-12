package myPackage;
import java.util.Scanner;

public class Ex3_1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your letter grade:");
		char grade = keyboard.next().charAt(0);
		double gradeValue = 0;
		switch(grade) {
		case 'A':
			gradeValue = 4.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		case 'a':
			gradeValue = 4.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		case 'B':
			gradeValue = 3.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		case 'b':
			gradeValue = 3.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		case 'C':
			gradeValue = 2.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		case 'c':
			gradeValue = 2.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		case 'D':
			gradeValue = 1.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		case 'd':
			gradeValue = 1.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		default:
			gradeValue = 0.0;
			System.out.println("Your grade is " + gradeValue);
			break;
		}
	}

}
