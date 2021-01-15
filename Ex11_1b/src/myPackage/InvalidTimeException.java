package myPackage;

public class InvalidTimeException extends Exception {
	
	public static boolean checkTime(String time) {
		String hour, minute, ap;
		int hourI,minuteI;
		hour=time.substring(0,time.indexOf(':'));
		minute=time.substring(time.indexOf(':')+1, time.indexOf(' '));
		ap=time.substring(time.indexOf(' ')+1);
		if(!InvalidHourException.checkHour(hour))
			return false;
		if(!InvalidMinuteException.checkMinute(minute))
			return false;
		 if (!(ap.equalsIgnoreCase("am")||ap.equalsIgnoreCase("pm")))
			 return false;
		 return true;
	}
}