package myPackage;

public class Staff extends Employee {
	private int payGrade;

	public int getPayGrade() {
		return payGrade;
	}

	public void setPayGrade(int newPayGrade) {
		if((newPayGrade>=1)&&(newPayGrade<=20))
			payGrade=newPayGrade;
	}
	Staff(){
		super();
		payGrade=0;
	}
	Staff(String name,int id,String department,int newPayGrade){
		super(name,id,department);
		payGrade=newPayGrade;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Staff member's pay grade:  "+payGrade);
	}
}
