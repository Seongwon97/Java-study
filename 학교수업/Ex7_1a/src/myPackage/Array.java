package myPackage;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the array length: ");
		int arrLength=keyboard.nextInt();
		int[] score =new int[arrLength];
		int temp;
		for(int i=0; i< arrLength; i++) {
			System.out.print("Enter the Score: ");
			temp = keyboard.nextInt();
			score[i]=temp;
		}
		
		double average = 0;
		for(int i=0; i< score.length ;i++) {
			average+=score[i];
		}
		average=average/score.length;
		System.out.println("The average is"+ average);
		
		System.out.print("Above the average score is ");
		for(int i=0; i < score.length; i++) {
			if(score[i]>average)
				System.out.print(score[i]+"  ");
		}
	}

}
