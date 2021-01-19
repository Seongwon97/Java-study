package myPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="words.txt";
		Scanner inputStream=null;
		String str;
		try {
			inputStream=new Scanner(new FileInputStream(fileName));
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+fileName);
			System.exit(0);
		}
		while(inputStream.hasNextLine()) {
			str=inputStream.nextLine();
			if(str.indexOf("dous")>0) {
				System.out.println(str);
			}
		}
		inputStream.close();
	}

}
