package myPackage;

public class Counter {
	private String choice1;
	public int counter=0;
	
	public String getChoice() {
		return choice1;
	}
	public void setChoice(String newChoice) {
		if(newChoice.equalsIgnoreCase("Increase")||newChoice.equalsIgnoreCase("Decrease"))
			choice1 = newChoice;
		else {
			System.out.println("Enter the right Choice!, Program exited ");
			System.exit(0);
		}
	}
	public void setCounter(String newChoice) {
		choice1 = newChoice;
	}
	public int Check() {
		if(choice1.equalsIgnoreCase("Increase"))
			counter++;
		else if(choice1.equalsIgnoreCase("Decrease")) {
			if(counter > 0)
				counter--;
			else
				counter=0;
		}
		return counter;
	}
	
}
