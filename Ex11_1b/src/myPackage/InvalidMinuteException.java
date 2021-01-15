package myPackage;

public class InvalidMinuteException extends InvalidTimeException {
    public static boolean checkMinute(String minute) {
        int minuteI = Integer.parseInt(minute);
        if (!((0 <= minuteI) && (minuteI < 60)))
        	return false;
        return true;
    }
}
