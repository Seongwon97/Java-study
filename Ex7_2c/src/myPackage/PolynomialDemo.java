package myPackage;
import java.util.Scanner;
public class PolynomialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Polynomial poly = new Polynomial();
		
		int degree;
		System.out.print("Enter the degree: ");
		degree = keyboard.nextInt();
		poly.polynomial(degree);
		
		double temp;
		for(int i=0; i<poly.getArr().length; i++) {
			System.out.print("Enter the a"+i+":  ");
			temp = keyboard.nextDouble();
			poly.setConstant(i, temp);
		}
		
		int x;
		System.out.print("Enter the X:  ");
		x=keyboard.nextInt();
		System.out.println("P(x)= "+poly.exalute(x));
	}

}
