package myPackage;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] frequency = new int[10];
		
		for(int i=0; i<10; i++) {
			frequency[i]=0;
		}
		System.out.print("Enter the Phone number: ");
		String phoneNum = keyboard.nextLine();
		for(int i=0; i<phoneNum.length(); i++) {
			switch(phoneNum.charAt(i)) {
			case '0': 
				frequency[0]++;
				break;
			case '1': 
				frequency[1]++;
				break;
			case '2': 
				frequency[2]++;
				break;
			case '3':
				frequency[3]++;
				break;
			case '4':
				frequency[4]++;
				break;
			case '5':
				frequency[5]++;
				break;
			case '6':
				frequency[6]++;
				break;
			case '7':
				frequency[7]++;
				break;
			case '8':
				frequency[8]++;
				break;
			case '9': 
				frequency[9]++;
				break;
			}
		}
		for(int i=0; i<frequency.length; i++) {
			System.out.println("f["+i+"] = "+frequency[i]);	
		}
	}

}
