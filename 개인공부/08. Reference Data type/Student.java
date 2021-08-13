package ch09;

public class Student {
	int studentId;
	String studentName;
	
	Subject korea; // 여기서 정의한 것은 주소만을 정의한 것이라 아래서 생성자로 새로 생성해줘야한다.
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		// Subject생성자로 객체 생성
		// 일반적으로 생성자(여기서는 Student)에서 생성을 해준다.
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
		System.out.println(studentName +  " 학생의 총점은 " + total + "점 입니다." );
		
	}

}
