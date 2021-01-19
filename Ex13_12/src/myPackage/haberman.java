package myPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class haberman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="haberman.data";
		Scanner inputStream=null;
		int node;
		int status;
		double dieNode=0;
		double surviveNode=0;
		int survive=0;
		int die=0;
		try {
			inputStream= new Scanner(new File(input));
			while(inputStream.hasNextLine()) {
				String str=inputStream.nextLine();
				String[] arr=str.split(",");
				node=Integer.parseInt(arr[2]);
				status=Integer.parseInt(arr[3]);
				if(status==2) {
					dieNode=dieNode+node;
					die++;
				}
				else {
					surviveNode=surviveNode+node;
					survive++;
				}
			} 
			inputStream.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error opening the file"+input);
			System.exit(0);
		}catch(IOException e) {
		    System.out.println("Problem with output to file " + input);
		}
		dieNode=dieNode/die;
		surviveNode=surviveNode/survive;
		System.out.println("Average 5 years or more is "+ surviveNode);
		System.out.println("Average less than 5 years is "+ dieNode);
	}

}
