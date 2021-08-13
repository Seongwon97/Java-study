package ch04;

public class Student {
	public int studentID;
	public String studentName; //string은 java에서 지원하는 class이다.
	public String address;
	
	public void showStudentInfo() {
		System.out.println( studentID + "학번 학생의 이름은 "+ studentName+ "이다.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
