package myPackage;

public class PolymorphismDemo{
	public static void main(String[] args){
		Person[] people = new Person[7];
		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		people[4] = new Employee("John", 2016, "Software");
		people[5] = new Faculty("James",2017,"Design","Art");
		people[6] = new Staff("Kelly",2016,"Economics",3);
		for (Person p : people){
			p.writeOutput();
			System.out.println();
		}
	}	
}