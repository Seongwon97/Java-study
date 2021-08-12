package myPacakge;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex13_2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="number.txt";
		String output="number.dat";
		Scanner inputStream= null;
		try {
			inputStream= new Scanner(new File(input));
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+input);
			System.exit(0);
		}
		
		try {
			 ObjectOutputStream outputStream =new ObjectOutputStream(new FileOutputStream(output));
			 int first=inputStream.nextInt();
			 outputStream.writeInt(first);
			 int num;
			 byte difference;
			 while(inputStream.hasNextInt()) {
				 num=inputStream.nextInt();
				 difference=(byte)(first-num);
				 first=num;
				 outputStream.writeByte(difference);
			 }
			 outputStream.close();
			 inputStream.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+output);
			System.exit(0);
		}catch(IOException e) {
		    System.out.println("Problem with output to file " + output);
		}
		try {
            ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream(output));
            int num = inputStream2.readInt();
            System.out.println(num);
            try {
                while (true) {
                    byte difference = inputStream2.readByte();
                    num=num+(int)difference;
                    System.out.println(num);
                }
            }catch (EOFException e) {
            	inputStream2.close();
            }
        }catch (IOException e) {
        	System.out.println("Problem with file " + output);
        }
	}

}
