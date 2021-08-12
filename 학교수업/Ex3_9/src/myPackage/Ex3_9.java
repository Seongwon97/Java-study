package myPackage;
import java.util.Scanner;

public class Ex3_9 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		String first, subStr1, subStr2, temp;
		int wordLength = 0, a=1;

		while(a>0) {
			System.out.println("Enter the word(If you want to finish this program emter the quit): ");
			word = keyboard.nextLine();
			if(word.equalsIgnoreCase("quit")) {
				System.out.println("Program exited");
				System.exit(0);
			}
			System.out.println("The word is "+word);
			subStr2="";
			word = word.toLowerCase();
			first = word.substring(0,1);
			subStr1 = word.substring(1);
			subStr1 = subStr1.concat(first);
			wordLength = word.length();
			for(int i=wordLength-1; i>=0; i--) {
				temp = subStr1.substring(i,i+1);
				subStr2 = subStr2.concat(temp);
			}
			System.out.println("The changed word is "+ subStr2);
			if(word.equalsIgnoreCase(subStr2))
				System.out.println("First word and changed word is same\n");
			else
				System.out.println("First word and changed word is different\n");

		}
	}
}
