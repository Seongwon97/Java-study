package myPackage;
import java.util.Scanner;

public class CountDigit {
	public static int countDigit(String s) {
        if (s.length() > 1) {
            String str1  = s.substring(0, s.length() / 2);
            String str2 = s.substring(s.length() / 2);
            return countDigit(str1) + countDigit(str2);
        }
        else {
        	if(Character.isDigit(s.charAt(0)))
        		return 1;
        	else 
        		return 0;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the String: ");
		Scanner keyboard = new Scanner(System.in);
		String str=keyboard.nextLine();
		System.out.println("Count Digit: "+countDigit(str));
	}

}
