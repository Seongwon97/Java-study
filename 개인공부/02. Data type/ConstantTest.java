package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_NUM = 100; // final은 상수로 한번 지정을 하게 되면 그 후에 값 변경은 안된다.
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; //상수는 값 변경을 하는거라 한번 초기화를 해주면 그 이후에는 변경 불가!!

	}

}
