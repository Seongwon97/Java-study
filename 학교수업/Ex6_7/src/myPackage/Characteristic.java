package myPackage;
import java.util.Scanner;

public class Characteristic{
	Scanner keyboard= new Scanner(System.in);
	private String description;
	private int rating;
	
	Characteristic(String str1){
		rating=0;
		description=str1;
	}
	
	public boolean isValid(int rate) {
		return (rate>=1)&&(rate<=10);
	}
	public void setRating(int rate) {
		if(isValid(rate)) {
			rating=rate;
		}
		else
			System.out.println("Wrong rating");
	}
	public void setRating() {
		System.out.print("Enter the rating: ");
		int rate;
		rate= keyboard.nextInt();
		if(isValid(rate))
			setRating(rate);
		else
			System.out.println("Wrong rating");
	}

	public String getDescription() {
		return description;
	}

	public int getRating() {
		return rating;
	}
	public boolean isMatch(Characteristic otherRate) {
		return description.equals(otherRate.description);
	}
	public double getCompatability(Characteristic otherRate) {
		if(!isMatch(otherRate)) {
			return 0;
		}
		else {
			return compatibilityMeasure(otherRate);
		}
		
	}
	public double compatibilityMeasure(Characteristic otherRate) {
		double m;
		int rate1=rating, rate2=otherRate.getRating();
		m=1-((double)((rate1-rate2)*(rate1-rate2))/81);
		return m;
	}
	
}
