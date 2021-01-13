package myPackage;

public class DoctorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Doctor doctor1=new Doctor("James", "Surgery",100.0);
		Doctor doctor2=new Doctor();
		Doctor doctor3=new Doctor("James", "Surgery",100.0);
		doctor2.setName("Jin");
		doctor2.setString1("Dentist");
		doctor2.setVisit_fee(120.0);
		System.out.println("Doctor1");
		System.out.println(doctor1.toString());
		System.out.println();
		System.out.println("Doctor2");
		System.out.println(doctor2.toString());
		System.out.println();
		System.out.println("Doctor3");
		System.out.println(doctor3.toString());
		System.out.println();
		System.out.println("Doctor1 and Doctor2 are same");
		System.out.println(doctor1.equals(doctor2));
		System.out.println();
		System.out.println("Doctor1 and Doctor3 are same");
		System.out.println(doctor1.equals(doctor3));
	}

}
