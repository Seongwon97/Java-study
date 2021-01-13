package myPackage;
import java.util.Scanner;

public class MessageEncoderDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String plainText=keyboard.nextLine();
		System.out.print("Enter the message shift num: ");
		int num = keyboard.nextInt();
		SubstitutionCipher shift = new SubstitutionCipher(num);
		System.out.print("Shifted text: ");
		System.out.println(shift.encode(plainText));
		
		System.out.print("Enter the message shuffle num: ");
		num = keyboard.nextInt();
        ShuffleCipher shuffle = new ShuffleCipher(num);
        System.out.print("Shuffled text: ");
        System.out.println(shuffle.encode(plainText));
	}

}
