package ch03;

public class MyNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNumber myNumber = (x, y) -> x > y? x : y;
		
		/* 아래와 같이 표현도 가능하다.
		MyNumber myNumber = (x, y) -> {
			if (x > y) 
				return x;
			else return y;
		};
		*/
		
		System.out.println(myNumber.getMax(10, 20));
	}

}
