package ch17;

public class Employee {
	
	// ch16와 다르게 serialNum을 public에서 private로 변경
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		// static 변수를 get하는 곳에서는 다른 변수들의 정의나 값 변경이 불가
		// 이유: static변수는 인스턴스가 생성되지 않아도 이미 메모리를 잡아둔 상태라 사용가능하다.
		//		-> 인스턴스가 생성전에 인스턴스 데이터를 할당하는건 잘못되었기에 여기서 다른 값들 변경은 불가
		//		-> 하지만 반대로 다른 함수들에서 static값 변경은 가능하다.
		
		// employeeName = "Lee"; 이런게 안됨
		 
		return serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
