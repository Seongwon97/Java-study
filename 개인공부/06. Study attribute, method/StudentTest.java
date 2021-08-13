package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		// student1을 참조 변수라고 한다.
		// 하나의 인스턴스(객체)이기도 하다.
		// 인스턴스들은 힙메모리에 할당된다.
		
		student1.setStudentName("Swongwon");
		student1.studentID = 12345;
		student1.address = "서울 강남구";
		
		student1.showStudentInfo();
	}

}
