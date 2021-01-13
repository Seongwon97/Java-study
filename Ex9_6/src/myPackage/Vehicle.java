package myPackage;

public class Vehicle {
	private String name;
	private int numOfCylinder;
	private Person owner=new Person();
	
	Vehicle(){
		name = "No name yet";
		numOfCylinder=0;
	}
	Vehicle(String newStr, int newNum, Person newPer) {
		name=newStr;
		numOfCylinder=newNum;
		owner.setName(newPer.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getNumOfCylinder() {
		return numOfCylinder;
	}
	public void setNumOfCylinder(int newNumOfCylinder) {
		numOfCylinder = newNumOfCylinder;
	}
	public void writeOutput(){
		System.out.println("Name: " + name);
		System.out.println("Number of cylinder: " + numOfCylinder);
		System.out.println("Owner: " + owner.getName());
	}
    public boolean equals(Vehicle otherObject) {
        if (!(otherObject != null && otherObject instanceof Vehicle))
            return false;
        Vehicle ex = (Vehicle)otherObject;
        return this.name==ex.getName() && numOfCylinder==ex.getNumOfCylinder() && owner.hasSameName(ex.owner);
        }
}
