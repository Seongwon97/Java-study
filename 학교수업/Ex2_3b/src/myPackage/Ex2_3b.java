package myPackage;
import java.util.Scanner;

public class Ex2_3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, depth;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the radius(in inches) and depth(in feet): ");
		radius = keyboard.nextInt();
		depth = keyboard.nextInt();
		double radiusFeet;
		radiusFeet = radius / 12;
		double volume;
		volume = Math.PI * radiusFeet * radiusFeet * depth * 7.48;
		System.out.println(depth+ "-foot well witha radius of " + radius + " inches holds about " + volume +" gallons of water");
	}

}
