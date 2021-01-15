package myPackage;

public class InvalidHourException extends InvalidTimeException{
	public static boolean checkHour(String hour) {
        int hourI = Integer.parseInt(hour);
        if (!((hourI >= 0) && (hourI <= 12)))
        	return false;
        return true;
    }
}
