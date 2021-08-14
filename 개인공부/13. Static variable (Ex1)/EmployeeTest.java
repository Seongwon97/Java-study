package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("이순신");
		
		//System.out.println(employee1.serialNum);
		// Static변수들은 인스턴스 이름이 아닌 class이름을 참조하여 사용해야한다.
		System.out.println(Employee.serialNum);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("김유신");
		employee2.serialNum++;
		
		System.out.println(employee1.serialNum);
		System.out.println(employee2.serialNum);
		// employee2의 serialNum을 1 증가시켰는데
		// employee1의 serialNum도 숫자가 올라간 것을 통해 
		// 2개의 인스턴스가 하나의 메모리를 공유하고 있다는 것을 알 수 있다.
		
	}

}
