package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(100, "Oh");
		
		student1.setKoreaSubject("����", 100);
		student1.setMathSubject("����", 100);
		
		
		Student student2 = new Student(100, "Kim");
		
		student2.setKoreaSubject("����", 80);
		student2.setMathSubject("����", 70);
		
		student1.showStudentSocre();
		student2.showStudentSocre();
	}

}
