package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Customer sell");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Customer buy");		
	}
	
	
	// default method인 order가 Buy, Sell인터페이스에서 중복이 되어서
	// 둘 중 하나를 재정의하여 사용해야한다.
	@Override
	public void order() {
		// TODO Auto-generated method stub
		// 아래 예시는 Buy꺼를 재정의하여 사용한 예시
		// Buy.super.order();
		
		// 아예 새로 재정의 한 예시
		System.out.println("Customer order");
	}
	
	public void hello() {
		System.out.println("Hello");
	}

}
