package myPackage;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num=keyboard.nextInt();
		for(int i=1;i<=num;i++) {
			
			System.out.print("Fibonacci #"+i+" = "+fibonacci(i));
			if(i>2)
				System.out.println("; "+fibonacci(i)+"/"+fibonacci(i-1)+" = "+((float)fibonacci(i)/fibonacci(i-1)));
			else
				System.out.println();
		}
	}
	public static int fibonacci(int num) {
		if(num==1)
			return 0;
		else if(num==2)
			return 1;
		else 
			return fibonacci(num-1)+fibonacci(num-2);
	}
}
