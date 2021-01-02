package myPackage;
import java.util.Scanner;

public class Ex3_1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		System.out.println("How much is the price of the item?");
		Scanner keyboard = new Scanner(System.in);
		price = keyboard.nextInt();
		if(price < 25)
			if ((price%5) != 0) {
				System.out.println("Error");
				System.exit(0);
			}
		if (price>100) {
			System.out.println("Error");
			System.exit(0);
		}
		System.out.print("The for an item of " +price +" cents, the change is " +(100-price) +" cents");
		int remain;
		remain = 100 - price;
		System.out.print(", which is given by "+ (remain/25) + " quaters, ");
		remain = remain % 25;
		System.out.print((remain/10) + " dimes, ");
		remain = remain % 10;
		System.out.print((remain/5) + " nickels");

	}

}
