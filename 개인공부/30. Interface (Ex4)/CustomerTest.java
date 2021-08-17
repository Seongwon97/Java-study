package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		// customer를 Buy라는 타입으로 Upcasting하는 것
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		// buyer.order의 결과는 Customer형으로 생성하며 재정의되었기에 customer의 order결과가 나온다.
		
		 Sell seller = customer;
		 seller.sell();
		 seller.order();
	}

}
