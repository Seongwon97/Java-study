package myPackage;
import java.util.Scanner;
public class DisplayWord {
	
	public static void displayAsWords(int number) {
		char[] num = Integer.toString(number).toCharArray();
		for(int i=0;i<num.length;i++) {
			System.out.print(getWordFromDigit(num[i]-'0')+"  ");	
		}
	}
	public static String getWordFromDigit(int digit) {
	    String[] word = new String[] {
	        "zero", "one", "two", "three", "four",
	        "five", "six", "seven", "eight", "nine"
	    };
	    return word[digit];
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num1=keyboard.nextInt();
        displayAsWords(num1);
        System.out.println();
        System.out.print("Enter the number: ");

        int num2=keyboard.nextInt();
        displayAsWords(num2);
    }
}
