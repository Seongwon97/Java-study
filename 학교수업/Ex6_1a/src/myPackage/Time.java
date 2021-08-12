package myPackage;

public class Time {
	private int hour,minute;

	Time(){
		hour=0;
		minute=0;
	}
		
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}

	public static boolean isValid(int newhour, int newminute) {
		return (newhour>=0)&&(newhour<24)&&(newminute>=0)&&(newminute<60);
	}
	
	
	public void setTime(int newhour, int newminute) {
		if(isValid(newhour,newminute)) {
			hour=newhour;
			minute=newminute;
		}
		else {
			System.out.println("Wrong time");
			System.exit(0);
		}
	}
	public static boolean isPM(int newhour) {
		return (newhour<12);
	}
	
	public void setTime2(int newhour, int newminute, boolean isPM) {
		if(isPM)
			newhour=newhour+12;
		this.setTime(newhour, newminute);
	}
}
