package myPackage;

public class Employee extends Person {
	private int id;
	private String department;
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public String getDpartment() {
		return department;
	}
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	Employee(){
		super();
		id=0;
		department="";
	}
	Employee(String name, int newId, String newDepartment){
		super(name);
		id=newId;
		department=newDepartment;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Employee ID:  "+id);
		System.out.println("Employee's department:  "+department);
	}
	
}
