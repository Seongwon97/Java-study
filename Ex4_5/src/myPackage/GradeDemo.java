package myPackage;
import java.util.Scanner;

public class GradeDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Grade grade1 = new Grade();
		int GradeNum=0;
		int numberOfStudent=0;
		
		System.out.println("Enter the number of student who recieved thr grade A");
		GradeNum = keyboard.nextInt();
		grade1.getaCount();
		grade1.setaCount(GradeNum);
		numberOfStudent=numberOfStudent+GradeNum;
		
		System.out.println("Enter the number of student who recieved thr grade B");
		GradeNum = keyboard.nextInt();
		grade1.getbCount();
		grade1.setbCount(GradeNum);
		numberOfStudent=numberOfStudent+GradeNum;
		
		System.out.println("Enter the number of student who recieved thr grade C");
		GradeNum = keyboard.nextInt();
		grade1.getcCount();
		grade1.setcCount(GradeNum);
		numberOfStudent=numberOfStudent+GradeNum;
		
		System.out.println("Enter the number of student who recieved thr grade D");
		GradeNum = keyboard.nextInt();
		grade1.getdCount();
		grade1.setdCount(GradeNum);
		numberOfStudent=numberOfStudent+GradeNum;
		
		System.out.println("Enter the number of student who recieved thr grade F");
		GradeNum = keyboard.nextInt();
		grade1.getfCount();
		grade1.setfCount(GradeNum);
		numberOfStudent=numberOfStudent+GradeNum;


		grade1.getCount();
		grade1.setCount(numberOfStudent);
		
		grade1.graph();
	}

}
