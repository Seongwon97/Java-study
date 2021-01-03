package myPackage;
import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the triangle size(from 1 to 50)");
		int size=keyboard.nextInt();
		if((size<1)||(size>50)) {
			System.out.println("Error");
			System.exit(0);
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<(i+1);j++)
				System.out.print("*");
			System.out.println("");
		}
		for(int i=(size-1);i>0;i--) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println("");
		}
	}

}
