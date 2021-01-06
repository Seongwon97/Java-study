package myPackage;

public enum Suit {
	CLUBS("black"), DIAMOND("red"), HEARTS("red"),SPADES("black");
	
	private final String color;
	
	private Suit(String suitColor) {
		color = suitColor;
	}
	public String getColor() {
		return color;
	}
}
