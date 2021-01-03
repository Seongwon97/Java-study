package myPackage;
import java.util.Scanner;

public class Ex3_2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int integer = 1, min = 0, i = 0;
		int max = -1;
		double average = 0;
		System.out.println("Enter the intergers: ");
		while(integer >= 0){
			integer = keyboard.nextInt();
			if((integer < 0) && (i==0))	{
				System.out.println("There is no non-negetive integers.");
				System.exit(0);
			}
			if ((integer >= 0) && (i==0)) {
				max = integer;
				min = integer;
				
			}
			if((integer >= 0) && (integer < min))
				min = integer;
			if(integer > max)
				max = integer;
			if(integer >= 0)
				average += integer;
			i++;
		}
		average= average/(i-1);
		System.out.println("The max integer is "+ max +", min integer is "+ min+" and average is "+ average);
	}

}
