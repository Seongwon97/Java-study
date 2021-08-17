package ch02;

public class Student implements Cloneable{ // 해당 class를 clone할 수 있다고 구현
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	
	public String toString() {
		return studentNum + ", "+ studentName;
	}
	
	public void setStudnetName(String name) {
		this.studentName = name;
	}
	
	
	// 같은 값을 같은 instance를 논리적으로 같다고 판별하기 위해서는 equels와 hashCode method를 재정의해야한다.
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) { //obj가 Student의 instance인가 확인
			Student std = (Student) obj; //obj를 Student로 downcasting
			if(this.studentNum == std.studentNum)
				return true;
			else
				return false;
		}
		return false;
	}

	
	// 객체의 현재 상태를 그대로 복사하는데 사용하는 method로 clone()메서드를 사용하면 객체의 정보(멤버 변수 값등...)가 
	// 동일한 또 다른 인스턴스가 생성되는 것이므로, 객체 지향 프로그램에서의 정보 은닉, 객체 보호의 관점에서 위배될 수 있다.
	// 그리하여 모든 class에서 사용이 가능한 것이 아니고 implements Cloneable를 넣은 class에서만 사용가능하다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
