package myPackage;

public class Employee extends Person{
	private double salary;
    private String ssn;
    Employee(){
        super();
        salary = 0;
        ssn = "000000000";
    }
    Employee (String newName, double newSalary)
    {
        super(newName);
        salary = newSalary;
    }
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Salary: " + salary);
        System.out.println("SSN : " + ssn);
    }
}
