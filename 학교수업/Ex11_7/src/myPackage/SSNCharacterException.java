package myPackage;

public class SSNCharacterException extends Exception {
	public SSNCharacterException()
    {
        super("Invalid. There are mixed with non digit. ");
    }
	public SSNCharacterException(String message)
    {
        super(message);
    }
}
