package ch16;

public class EmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("이순신");
				
		Employee employee2 = new Employee();
		employee2.setEmployeeName("김유신");

		System.out.println(employee1.getEmployeeName() + "님의 사번은 " + employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeName() + "님의 사번은 " + employee2.getEmployeeId());
	}

}
