package myPackage;

public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time();
		time.setTime(3, 53);
		System.out.println(time.getHour()+" : "+time.getMinute());
		System.out.println("Execute setTime2");
		time.setTime2(3, 53, time.isPM(3));
		System.out.println(time.getHour()+" : "+time.getMinute());
		System.out.println("This is the case when I put wrong values");
		time.setTime(16, 84);
	}

}
