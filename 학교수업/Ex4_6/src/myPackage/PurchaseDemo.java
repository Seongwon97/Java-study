package myPackage;

public class PurchaseDemo {
	public static void main(String[] args) {
		Purchase oneSale = new Purchase();
		System.out.println("Oranges: 10 for $2.99");
		System.out.println("Eggs: 12 for $1.69");
		System.out.println("Apples: 3 for $1.00");
		System.out.println("Watermelons: $4.39 each");
		System.out.println("Bagels: 6 for $3.5");
		System.out.println();
		
		System.out.println("2 dozen oranges");
		oneSale.setPrice(10, 2.99);
		oneSale.setNumberBought(24);
		oneSale.setName("Orange");
		oneSale.writeOutput();
		System.out.println("Cost each $" + oneSale.getUnitCost());
		System.out.println("Total cost $" +oneSale.getTotalCost());
		System.out.println();
		
		System.out.println("3 dozen eggs");
		oneSale.setPrice(12, 1.69);
		oneSale.setNumberBought(36);
		oneSale.setName("Egg");
		oneSale.writeOutput();
		System.out.println("Cost each $" + oneSale.getUnitCost());
		System.out.println("Total cost $" +oneSale.getTotalCost());
		System.out.println();
		
		System.out.println("20 apples");
		oneSale.setPrice(3, 1.00);
		oneSale.setNumberBought(20);
		oneSale.setName("apple");
		oneSale.writeOutput();
		System.out.println("Cost each $" + oneSale.getUnitCost());
		System.out.println("Total cost $" +oneSale.getTotalCost());
		System.out.println();
		
		System.out.println("2 watermelons");
		oneSale.setPrice(1, 4.39);
		oneSale.setNumberBought(2);
		oneSale.setName("watermelon");
		oneSale.writeOutput();
		System.out.println("Cost each $" + oneSale.getUnitCost());
		System.out.println("Total cost $" +oneSale.getTotalCost());
		System.out.println();
		
		System.out.println("2 dozen oranges");
		oneSale.setPrice(6, 3.5);
		oneSale.setNumberBought(12);
		oneSale.setName("bagel");
		oneSale.writeOutput();
		System.out.println("Cost each $" + oneSale.getUnitCost());
		System.out.println("Total cost $" +oneSale.getTotalCost());
		System.out.println();
		
		System.out.println();
		oneSale.totalBill();
	}
}
