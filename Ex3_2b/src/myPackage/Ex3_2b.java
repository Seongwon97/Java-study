package myPackage;
import java.util.Scanner;

public class Ex3_2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your integer grade, If you have finished typing, enter a negative number:");
		Scanner keyboard = new Scanner(System.in);
		int integer=1;
		int aCount=0, bCount=0, cCount=0, dCount=0, fCount=0;
		while(integer > 0) {
			integer = keyboard.nextInt();
			if((integer >= 90) && (integer <= 100))
				aCount++;
			if((integer >= 80) && (integer <= 89))
				bCount++;
			if((integer >= 70) && (integer <= 79))
				cCount++;
			if((integer >= 60) && (integer <= 69))
				dCount++;
			if((integer >= 0) && (integer <= 59))
				fCount++;
		}
		System.out.println("A count: "+aCount+", B count: "+bCount+", C count: "+cCount+", D count: "+dCount+", F count: "+fCount);
	}

}
