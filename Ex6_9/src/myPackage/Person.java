package myPackage;

public class Person {
	private String name;
	private int age;
	
	Person(){
		name="No name yet";
		age=0;
	}
	Person(String newName, int newAge){
		name=newName;
		age=newAge;
	}
	public static Person createAdult() {
		Person adult = new Person();
		adult.setName("An Adult");
		adult.setAge(21);
		return adult;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public static Person createToddler() {
		Person toddler = new Person();
		toddler.setName("A toddler");
		toddler.setAge(2);
		return toddler;
	}
	public static Person createPreschooler() {
		Person preSchooler = new Person();
		preSchooler.setName("A pre-schooler");
		preSchooler.setAge(5);
		return preSchooler;
	}
	public static Person createAdoledcent() {
		Person adolescent = new Person();
		adolescent.setName("An adolescent");
		adolescent.setAge(9);
		return adolescent;
	}
	public static Person createTeenager() {
		Person teenager = new Person();
		teenager.setName("A teenager");
		teenager.setAge(15);
		return teenager;
	}
}
