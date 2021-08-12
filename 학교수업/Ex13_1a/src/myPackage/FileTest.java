package myPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("File name: ");
		String fileName=keyboard.nextLine();
		PrintWriter outputStream = null;
		try {
			outputStream= new PrintWriter(fileName);
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}
		for(int i=0; i<10;i++) {
			int num=(int)(Math.random() * 10000);
			outputStream.println(num);
		}
		outputStream.close();
		
		
		Scanner inputStream= null;
		try {
			inputStream= new Scanner(new File(fileName));
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}
		
		int min=10000, max=0;
		double sum=0.0, ave=0.0;
		for(int i=0;i<10;i++) {
			int num=inputStream.nextInt();
			if(min>num)
				min=num;
			if(max<num)
				max=num;
			sum=sum+num;
		}
		inputStream.close();
		ave=sum/10;
		System.out.println("Min = "+ min);
		System.out.println("Max = "+ max);
		System.out.println("Sum = "+ sum);
		System.out.println("Average = "+ ave);
	}

}