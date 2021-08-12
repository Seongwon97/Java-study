package myPackage;
import java.util.Scanner;

public class Ex3_14 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the initial velocity of the ball: ");
		double velocity = keyboard.nextDouble();
		int i=0, time=0;
		double height=0;
		System.out.println("Time: "+time+" Height: "+height);
		while(i<5) {
			height= height+velocity;
			velocity=velocity-32;
			time++;
			if(height<0) {
				System.out.println("Bounce");
				height=height*(-0.5);
				velocity=velocity*(-0.5);
				i++;
				if(i==5)
					System.exit(0);
			}	
			System.out.println("Time: "+time+" Height: "+height);
			
		}
	}
}
