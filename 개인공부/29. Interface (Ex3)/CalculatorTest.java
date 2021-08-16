package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		System.out.println("Static method test: " + Calc.total(arr));
		// interface에서 total은 static으로 생성한 method임으로 Calc를 통해 만든 class가 없더라도
		// Calc interface를 통해 total method를 사용할 수 있다.
		// 즉. interface에서 static으로 생성한 method는 인스턴스 없이 사용 가능하다!!
		
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
		
		calc.description();
	}

}
