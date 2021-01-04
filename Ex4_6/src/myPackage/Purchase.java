package myPackage;
import java.util.Scanner;
/**
Class for the purchase of one kind of item, such as 3 oranges.
Prices are set supermarket style, such as 5 for $1.25.
*/
public class Purchase {
	private String name;
	private int groupCount; //Part of a price, like the 2 in
	//2 for $1.99.
	private double groupPrice; //Part of a price, like the $1.99
	// in 2 for $1.99.
	private int numberBought; //Number of items bought.
	private double totalCost=0.0, eachTotalCost=0.0;
	/**
	Sets price to count pieces for $costForCount.
	For example, 2 for $1.99.
	 */
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setPrice(int count, double costForCount) {
		if ((count <= 0) || (costForCount <= 0)) {
			System.out.println("Error: Bad parameter in " +"setPrice.");
			System.exit(0);
		}
		else {
			groupCount = count;
			groupPrice = costForCount;
		}
	}
	public void setNumberBought(int number) {
		if (number <= 0) {
			System.out.println("Error: Bad parameter in " + "setNumberBought.");
			System.exit(0);
		}
		else
			numberBought = number;
		}
	void writeOutput() {
		System.out.println(numberBought + " "+ name);
	}
	public double getTotalCost() {
		eachTotalCost = (groupPrice / groupCount) * numberBought;
		totalCost=totalCost+eachTotalCost;
		return eachTotalCost;
	}
	public double getUnitCost() {
		return groupPrice / groupCount;
	}
	public int getNumberBought() {
		return numberBought;
	}
	public void totalBill() {
		System.out.println("Total bill is $"+totalCost);
	}
}