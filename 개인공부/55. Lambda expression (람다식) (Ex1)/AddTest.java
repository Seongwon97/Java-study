package ch02;

public class AddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add addC = (x, y) -> {return x+y;};
		// 인터페이스에 있는 함수를 람다식 구현	
		// 사용하는 방법
		System.out.println(addC.add(2,3));
	}
}
