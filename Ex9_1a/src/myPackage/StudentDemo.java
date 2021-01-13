package myPackage;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("James",15);
		Student student2=new Student();
		System.out.println("Student1");
		student1.writeOutput();
		System.out.println("\nStudent2");
		student2.writeOutput();
		System.out.println(student1.equals(student2));;
		student2.reset("James", 15);
		System.out.println("\nStudent2");
		student2.writeOutput();
		System.out.println(student1.equals(student2));
	}

}
