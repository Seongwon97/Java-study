package myPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestBinaryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("File name: ");
		String fileName=keyboard.nextLine();
		try {
		    ObjectOutputStream outputStream =new ObjectOutputStream(new FileOutputStream(fileName));
		    for(int i=0; i<10;i++) {
				int num=(int)(Math.random() * 10000);
				outputStream.writeInt(num);
			}
			outputStream.close();		
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}catch(IOException e) {
		    System.out.println("Problem with output to file " + fileName);
		}
		int min=10000, max=0;
		double sum=0.0, ave=0.0;
		try {
			ObjectInputStream inputStream =
				    new ObjectInputStream(new FileInputStream(fileName));

			for(int i=0;i<10;i++) {
				int num=inputStream.readInt();
				if(min>num)
					min=num;
				if(max<num)
					max=num;
				sum=sum+num;
				}
			inputStream.close();
			ave=sum/10;
			
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}catch(IOException e) {
		    System.out.println("Problem with output to file " + fileName);
		}

		System.out.println("Min = "+ min);
		System.out.println("Max = "+ max);
		System.out.println("Sum = "+ sum);
		System.out.println("Average = "+ ave);
	}

}