package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		// student1�� ���� ������� �Ѵ�.
		// �ϳ��� �ν��Ͻ�(��ü)�̱⵵ �ϴ�.
		// �ν��Ͻ����� ���޸𸮿� �Ҵ�ȴ�.
		
		student1.setStudentName("Swongwon");
		student1.studentID = 12345;
		student1.address = "���� ������";
		
		student1.showStudentInfo();
	}

}
