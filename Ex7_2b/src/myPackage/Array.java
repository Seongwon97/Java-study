package myPackage;
import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,column;
		Scanner keyboard = new Scanner(System.in);
		
		
		
		System.out.print("Array row:  ");
		row = keyboard.nextInt();
		System.out.print("Array column:  ");
		column = keyboard.nextInt();
		double[][] arr= new double[row][column];
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				arr[i][j]= (int)(Math.random()*10);
			}
		}
		System.out.println();
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.print("\nRow num: ");
		row = keyboard.nextInt();
		System.out.print("The sum of "+ row+" row is ");
		System.out.println(Array.getSum(arr, row-1));
		System.out.print("\nColumn num: ");
		column=keyboard.nextInt();
		System.out.print("The average of "+ column+" column is ");
		System.out.println(Array.getAverage(arr, column-1));
	}
	 public static double getSum(double[][] newArr, int newRow) {
		 double sum=0;
		 for(int i=0;i<newArr[newRow].length; i++)
			 sum=sum+newArr[newRow][i];
		 return sum;
	 }
	 public static double getAverage(double[][] newArr, int newColumn) {
		 double average=0;
		 for(int i=0;i<newArr.length; i++)
			 average=average+newArr[i][newColumn];
		 return (average/newArr.length);
	 }
}
