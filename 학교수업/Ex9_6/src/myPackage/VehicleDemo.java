package myPackage;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Jin");
		Vehicle vehicle1 = new Vehicle("Car", 5,person1);
		Vehicle vehicle2 = new Vehicle("Train", 10, person1);
		System.out.println("Vehicle1");
		vehicle1.writeOutput();
		System.out.println("\nVehicle2");
		vehicle2.writeOutput();
		System.out.println();
		System.out.println(vehicle1.equals(vehicle2));
		System.out.println();
		
		Truck truck1 = new Truck("Volvo",5,person1,5,6);
		Truck truck2 = new Truck("Volvo",5,person1,5,6);
		System.out.println("Turck1");
		truck1.writeOutput();
		System.out.println("\nTurck2");
		truck2.writeOutput();
		System.out.println();
		System.out.println(truck1.equals(truck2));
	}

}
