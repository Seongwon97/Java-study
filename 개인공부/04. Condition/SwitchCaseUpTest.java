package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		
		int month = 3;
		
		int day = switch (month) {
	    	case 1, 3, 5, 7, 8, 10,12 -> { // case1: case2: ~~대신 case1,2,3,4~를 사용하며 문장이 여러개인 경우 {}를 사용한다.
	    		System.out.println("한 달은 31일입니다."); 
	    		yield 31; // return대신 yield를 사용
	    		//break는 없어도 된다.
	    	}
	    	case 4,6,9,11 -> {
	    		System.out.println("한 달은 30일입니다."); 
	    		yield 30;
	    	}
	    	case 2 ->{
	    		System.out.println("한 달은 28일입니다.");
	    		yield 28;
	    	}
	    	default->{
	    		System.out.println("존재하지 않는 달 입니다."); 
	    		yield 0;
	    	}
		}; //문장 끝엔 ;도 필요
		System.out.println(month + "월은 " + day + "일입니다.");
	}
}
