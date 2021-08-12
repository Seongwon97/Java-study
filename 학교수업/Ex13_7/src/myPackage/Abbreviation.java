package myPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Abbreviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="FirstFile.txt";
		String output="Changed.txt";
		int count=0;
		Scanner abb=null;
		try {
			abb= new Scanner(new File("abbreviations.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+"abbreviations.txt");
			System.exit(0);
		}
		int i=0;
		String abbreviation[] =new String[6];
		while(abb.hasNextLine()) {
			String temp=abb.nextLine();
			abbreviation[i]=temp;
			i++;
		}
		abb.close();
		Scanner inputStream=null;
		try {
			inputStream= new Scanner(new File(input));
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+input);
			System.exit(0);
		}
		PrintWriter outputStream =null;
		try {
			outputStream=new PrintWriter(new File(output));
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+output);
			System.exit(0);
		}
		String str;
		while(inputStream.hasNext()) {
			str=inputStream.next();
			for(int j=0;j<6; j++) {
				if(str.equalsIgnoreCase(abbreviation[j])) {
					str="<"+str+">";
				}
			}
			outputStream.write(str);
			outputStream.write(" ");
		}
		inputStream.close();
		outputStream.close();
		Scanner inputStream1=null;
		try {
			inputStream1= new Scanner(new File(output));
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+output+"1");
			System.exit(0);
		}
		while(inputStream1.hasNext()) {
			System.out.print(inputStream1.next());
			System.out.print(" ");
		}
		inputStream1.close();

	}

}
