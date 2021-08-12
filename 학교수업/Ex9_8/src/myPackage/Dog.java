package myPackage;

public class Dog extends Pet{
	private String breed;
	private boolean boosterShot;
	
	Dog(){
		super();
		breed="None";
		boosterShot=false;
	}
	Dog(String name, int age, double weight,String newBreed, boolean newBooster){
		super(name, age,weight);
		breed=newBreed;
		boosterShot=newBooster;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Breed: "+breed);
		if(boosterShot)
			System.out.println("Booster shot");
		else
			System.out.println("Not Booster shot");
	}
}
