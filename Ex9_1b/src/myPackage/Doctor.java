package myPackage;

public class Doctor extends Person{
	double visit_fee;
	String string1;
	public double getVisit_fee() {
		return visit_fee;
	}
	public void setVisit_fee(double newVisit_fee) {
		if(newVisit_fee>0)
		visit_fee = newVisit_fee;
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String newString1) {
		String[] specialty=new String[]{"Medicine", "Surgery", "Dentist", "Oriental"};
		for(int i=0;i<4;i++) {
			if(newString1.equals(specialty[i])) {
				string1=newString1;
			}
		}
	}
	Doctor(){
		super();
	}
	Doctor(String name, String specialty, double fee){
		super(name);
		setString1(specialty);
		setVisit_fee(fee);
	}
    public String toString() {
        return "Name: " + this.getName() +"\nSpecialty: " + this.getString1()+ "\nVisit Fee: " + this.getVisit_fee();
    }
    public boolean equals(Object otherObject) {
        if (!(otherObject != null && otherObject instanceof Doctor))
            return false;
        Doctor otherDoctor = (Doctor)otherObject;
        return visit_fee==otherDoctor.getVisit_fee()&&
        		string1.equals(otherDoctor.getString1())&&
        		getName().equals(otherDoctor.getName());
    }

    

	
	
	
}
