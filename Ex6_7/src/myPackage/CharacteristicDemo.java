package myPackage;

public class CharacteristicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Characteristic apple = new Characteristic("apple");
		Characteristic banana = new Characteristic("banana");
		System.out.print("Enter the rate "+apple.getDescription());
		apple.setRating();
		System.out.println(apple.getDescription()+" rate is "+ apple.getRating());
		System.out.print("Enter the rate "+banana.getDescription());
		banana.setRating();
		System.out.println(banana.getDescription()+" rate is "+ banana.getRating());
		System.out.print("Compatibility measurs: ");
		System.out.println(apple.compatibilityMeasure(banana));
		
	}

}
