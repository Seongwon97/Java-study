package ch04;

public class Student {
	public int studentID;
	public String studentName; //string�� java���� �����ϴ� class�̴�.
	public String address;
	
	public void showStudentInfo() {
		System.out.println( studentID + "�й� �л��� �̸��� "+ studentName+ "�̴�.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
