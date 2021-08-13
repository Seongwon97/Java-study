package ch09;

public class Student {
	int studentId;
	String studentName;
	
	Subject korea; // ���⼭ ������ ���� �ּҸ��� ������ ���̶� �Ʒ��� �����ڷ� ���� ����������Ѵ�.
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		// Subject�����ڷ� ��ü ����
		// �Ϲ������� ������(���⼭�� Student)���� ������ ���ش�.
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	
	public void showStudentSocre() {
		int total = korea.score + math.score;
		System.out.println(studentName +  " �л��� ������ " + total + "�� �Դϴ�." );
		
	}

}
