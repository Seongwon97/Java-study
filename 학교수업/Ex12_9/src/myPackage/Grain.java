package myPackage;
import java.util.Scanner;

public class Grain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the num:  ");
		int k=keyboard.nextInt();
		System.out.println("Total grains : "+getTotalGrain(k,1));
	}
	public static int getTotalGrain(int k, int grains) {
		int sum=0;
		if(k==1)
			return grains;
		else {
			sum= grains+getTotalGrain(k-1,grains*2);
			return sum;
		}
	}
}
