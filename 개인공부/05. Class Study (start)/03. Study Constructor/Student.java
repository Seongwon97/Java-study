package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student(int studentNumber, String studentName, int grade) { 
		// �̰� ������! 
		// �Ѿ���� ������ ���� �ʱ�ȭ�� �ϰڴ�!
		// �̷��� �����ڸ� ������ �ʴ� ��� default constructor�� �ڵ����� ���������.
		
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.grade= grade;
		
		/*
		��������� �������� �ŰԺ����� ���� ��� ���� ��� studentName= studentName�� �Ѵٸ� ������ ����� ������
		���ǵ� ������ ������ �ȴ�. �׷��⿡ �ɹ������� ���� ���������� ���Ѵ�.
		�̷� ��� ������ �տ� this�� �ٿ� ��� ������ �ҷ��� �� �ִ�.
		�����̸��� �ٸ��� ��������� �Ϲ������δ� �������� �˱� ���� �ϱ�����(�򰥸��� �ʱ� ����) �̸��� ���� �����.
		*/
 		
	}
	
	public String showStudentInfo() {
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
}
