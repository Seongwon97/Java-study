package myPackage;

public class MonthException extends Exception {
	public MonthException()
    {
        super("It's not Invalid number for month.");
    }
	public MonthException(String message)
    {
        super(message);
    }
}
