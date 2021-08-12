package myPackage;

public class InvalidTimeException extends Exception {
	
	public static boolean checkTime(String time) {
		String hour, minute, ap;
		int hourI,minuteI;
		hour=time.substring(0,time.indexOf(':'));
		minute=time.substring(time.indexOf(':')+1, time.indexOf(' '));
		ap=time.substring(time.indexOf(' ')+1);
		hourI=Integer.parseInt(hour);
		minuteI=Integer.parseInt(minute);
		if(!((hourI>=0)&&(hourI<=12)))
			return false;
		if(!((minuteI>=0)&&(minuteI<60)))
			return false;
		 if (!(ap.equalsIgnoreCase("am")||ap.equalsIgnoreCase("pm")))
			 return false;
		 return true;
	}
}
