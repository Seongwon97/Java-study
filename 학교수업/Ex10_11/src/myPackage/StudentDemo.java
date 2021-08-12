package myPackage;

import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = new Student[5];
		student[0]=new Student("James", 2);
		student[1]=new Student("Iron Man", 10);
		student[2]=new Student("Thor", 8);
		student[3]=new Student("Black Panther", 13);
		student[4]=new Student("Hulk", 7);
		
		Arrays.sort(student);
		for(int i=0;i<5;i++) {
			student[i].writeOutput();
			System.out.println();
		}
	}

}