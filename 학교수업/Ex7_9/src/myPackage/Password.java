package myPackage;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] pin=new int[10];
		int[] pw={9,7,0,3,2,5};
		for(int i=0; i<10;i++) {
			pin[i]=(int)(Math.random()*10);
		}
		System.out.println("Password: 970325\n");
		System.out.print("PIN : ");
		for(int i=0;i<10;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.print("NUM : ");
		for(int i=0;i<10;i++) {
			System.out.print(pin[i]);
		}
		System.out.println();
		System.out.print("Enter the password: ");
		String input=keyboard.nextLine();
		int[] a=new int[input.length()];
		for(int i=0;i<input.length();i++) {
			a[i]=input.charAt(i)-48;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==pin[pw[i]]);
			else {
				System.out.println("Wrong PIN number");
				System.exit(0);
			}
			
			
		}
		System.out.println("Correct PIN number");
	}

}
