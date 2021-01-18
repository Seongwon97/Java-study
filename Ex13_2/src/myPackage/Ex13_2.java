package myPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ex13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String write1="number2.txt";
		String write2="number3.txt";
		Scanner number =null;
		try {
			number=new Scanner(new File("number.txt"));
			
		}catch (FileNotFoundException e) {
			System.out.println("Error opening the file number.txt");
			System.exit(0);
		}
		PrintWriter write=null;
		try {
			write =new PrintWriter(new File(write1));
		}catch (FileNotFoundException e) {
			System.out.println("Error opening the file number2.txt");
			System.exit(0);
		}
		
		try {
			 ObjectOutputStream writeBinary =new ObjectOutputStream(new FileOutputStream(write2));
			 while(number.hasNextInt()) {
					int num=number.nextInt();
					write.print(num);
					write.print("\n");
					int byteNum=(byte)(num);
					writeBinary.writeByte(byteNum);
				}
			 writeBinary.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+write2);
			System.exit(0);
		}catch(IOException e) {
		    System.out.println("Problem with output to file " + write2);
		}
		number.close();
		write.close();
	}

}
