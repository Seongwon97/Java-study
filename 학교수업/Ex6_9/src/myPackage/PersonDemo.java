package myPackage;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		System.out.print("Initialization  ");
		System.out.println(person.getName()+ " - "+person.getAge());
		person = person.createToddler();
		System.out.println(person.getName()+ " - "+person.getAge());		
		person = person.createPreschooler();
		System.out.println(person.getName()+ " - "+person.getAge());
		person = person.createAdoledcent();
		System.out.println(person.getName()+ " - "+person.getAge());
		person = person.createTeenager();
		System.out.println(person.getName()+ " - "+person.getAge());
		person = person.createAdult();
		System.out.println(person.getName()+ " - "+person.getAge());
	}

}