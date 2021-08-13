package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student(int studentNumber, String studentName, int grade) { 
		// 이게 생성자! 
		// 넘어오는 정보를 갖고 초기화를 하겠다!
		// 이렇게 생성자를 만들지 않는 경우 default constructor가 자동으로 만들어진다.
		
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.grade= grade;
		
		/*
		멤버변수와 생성자의 매게변수가 같은 경우 예를 들어 studentName= studentName을 한다면 변수는 가까운 곳에서
		정의된 변수를 따르게 된다. 그렇기에 맴버변수에 값을 정의하지를 못한다.
		이런 경우 변수명 앞에 this를 붙여 멤버 변수를 불러올 수 있다.
		변수이름이 다르면 상관없지만 일반적으로는 변수명을 알기 쉽게 하기위해(헷갈리지 않기 위해) 이름을 같게 만든다.
		*/
 		
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
