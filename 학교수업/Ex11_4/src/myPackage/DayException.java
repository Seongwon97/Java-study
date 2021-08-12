package myPackage;

public class DayException extends Exception{
	public DayException()
    {
        super("It's not Invalid number for day.");
    }
	public DayException(String message)
    {
        super(message);
    }
}
