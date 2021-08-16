package ch04;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	//protected는 하위 class는 접근 가능하나 그 외에는 접근하지 못하는 것.
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "+ bonusPoint + "입니다.";
	}

	
}
