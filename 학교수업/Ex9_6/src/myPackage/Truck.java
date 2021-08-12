package myPackage;

public class Truck extends Vehicle {
	private double load, towing;
	
	Truck(){
		super();
		load=0;
		towing=0;
	}
	Truck(String newStr, int newNum, Person newPer,double newLoad, double newTowing){
		super(newStr,newNum,newPer);
		load=newLoad;
		towing=newTowing;
	}
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Load capacity: " + load + " tons.");
        System.out.println("Towing capacity: " + towing + " tons.");
    }
    public boolean equals(Truck otherObject) {
       return this.load==otherObject.getLoad()&&this.towing==otherObject.getTowing()&&super.equals(otherObject);
    }
    
	public double getLoad() {
		return load;
	}
	
	public void setLoad(double newLoad) {
		this.load = newLoad;
	}
	
	public double getTowing() {
		return towing;
	}
	public void setTowing(double setTowing) {
		this.towing = setTowing;
	}

}
