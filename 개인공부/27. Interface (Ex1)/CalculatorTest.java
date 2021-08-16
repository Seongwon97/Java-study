package ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();
		// CompleteCalc는 Clac로부터 타입 상속을 받았다.
		// CompleteCalc는 Clac로부터 타입을 상속받아서 인스턴스 생성의 타입을 Calc로 해도 된다.
		// 그대신 Calc에 정의된 method들만 사용 가능하다. (CompleteCalc에 추가적으로 method를 만들면 사용 불가.)
		// CompleteCalc에 추가적으로 정의한 method를 사용하면 인스턴스의 타입을 CompleteCalc로 생성하면 된다.
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		// calc.showInfo();
	}

}
