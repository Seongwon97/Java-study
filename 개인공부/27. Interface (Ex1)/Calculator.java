package ch11;

public abstract class Calculator implements Calc {
	// interface를 implement하면 method들의 overriding을 하거나 
	// class를 abstract로 만들어야하는데 이 경우는 4개중 2개의 method들만
	// overriding을 하였기에 class도 abstract가 된다.
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

}
