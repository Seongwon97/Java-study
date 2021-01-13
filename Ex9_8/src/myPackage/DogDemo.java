package myPackage;

public class DogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog pet1=new Dog("Puppy1", 10, 3.4, "Bread1", true);
		Dog pet2=new Dog("Puppy2", 1, 5.9,"Bread2", false);
		Dog pet3=new Dog("Puppy3", 2, 8.0,"Bread3", false);
		Dog pet4=new Dog("Puppy4", 5, 6.4,"Bread4", true);
		Dog pet5=new Dog("Puppy5", 7, 7.5,"Bread5", true);
		if(pet1.getAge()>2) {
			pet1.writeOutput();
			System.out.println();
		}
		if(pet2.getAge()>2) {
			pet2.writeOutput();
			System.out.println();
		}
		if(pet3.getAge()>2) {
			pet3.writeOutput();
			System.out.println();
		}
		if(pet4.getAge()>2) {
			pet4.writeOutput();
			System.out.println();
		}
		if(pet5.getAge()>2) {
			pet5.writeOutput();
			System.out.println();
		}
	}
	
}
