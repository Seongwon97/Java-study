package myPackage;
import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the Bank account balance:");
		double balance=keyboard.nextDouble();
		System.out.println("Enter the interest rate:");
		double rate=keyboard.nextDouble();
		double aRate,mRate,dRate;
		aRate = 1+(rate/100);
		mRate = 1+(rate/12/100);
		dRate = 1+(rate/365/100);
		int i, j;
		double annually=0,monthly=0, daily=0;
		for(i=1; i<11; i++) {
			if(i==1) {
				annually = balance * aRate;
				for(j=0;j<12;j++) {
					if(j==0)
						monthly = balance *mRate;
					else
						monthly = monthly * mRate;
				}
				for(j=0;j<365;j++) {
					if(j==0)
						daily = balance *dRate;
					else
						daily = daily * dRate;
				}	
			}
			else {
				annually = annually * aRate;
				for(j=0;j<12;j++)
						monthly = monthly * mRate;
				for(j=0;j<365;j++)
						daily = daily * dRate;
			}
		}
		System.out.println("10 years later, annually account: "+annually);
		System.out.println("10 years later, monthly account: "+monthly);
		System.out.println("10 years later, daily account: "+daily);
	}

}