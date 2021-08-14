package ch10;

public class Birthday {
	private int day;
	private int month;
	private int year;
	// private로 정의되어 외부에서 접근이 안된다.
	
	private boolean isValid;
	// integer는 default값이 0이며 boolean은 default값이 False이다.
	
	public int getDay( ) {
		return day;
	}
	
	public void setDay(int day) {
		this.day= day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 "+ day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않습니다.");
		}
	}
}
