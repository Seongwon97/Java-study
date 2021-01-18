package myPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile="name.txt";
		String outputFile="rename.txt";
		
		Scanner input=null;
		PrintWriter output=null;
		Scanner output1=null;
		
		try {
			input = new Scanner(new File(inputFile));
		}catch (FileNotFoundException e) {
			System.out.println("Error opening the file "+ inputFile);
			System.exit(0);
		}
		try {
			output=new PrintWriter(outputFile);
		}catch (FileNotFoundException e) {
			System.out.println("Error opening the file "+ outputFile);
			System.exit(0);
		}
		while(input.hasNext()) {
			String name1=input.next();
			String name2=input.next();
			output.println(name1+" "+name2);
		}
		input.close();
		output.close();
		
		try {
			output1 = new Scanner(new File(outputFile));
		}catch (FileNotFoundException e) {
			System.out.println("Error opening the file "+ outputFile);
			System.exit(0);
		}
		while(output1.hasNext()) {
			String name=output1.nextLine();
			System.out.println(name);
		}
		output1.close();
	}

}
