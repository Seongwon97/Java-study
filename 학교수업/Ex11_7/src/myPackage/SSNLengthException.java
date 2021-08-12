package myPackage;

public class SSNLengthException extends Exception{
	public SSNLengthException()
    {
        super("Invalid. The digit is not nine digits. ");
    }
	public SSNLengthException(String message)
    {
        super(message);
    }

}
