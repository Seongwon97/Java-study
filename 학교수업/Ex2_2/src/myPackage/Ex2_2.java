package myPackage;
import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyBoard = new Scanner(System. in);
		String mainText;
		String subText, subText1, subText2, firstChar;
		System.out.println("Enter the text");
		mainText = keyBoard.nextLine();
		int positionSpace = mainText.indexOf(" ");	
		subText1 = mainText.substring(positionSpace+2);
		firstChar = mainText.substring(positionSpace+1, positionSpace+2);
		firstChar = firstChar.toUpperCase();
		subText2 = mainText.substring(0, positionSpace);
		subText = firstChar.concat(subText1);
		subText = subText.concat(" ");
		subText = subText.concat(subText2);
		System.out.print(subText);
	}

}
