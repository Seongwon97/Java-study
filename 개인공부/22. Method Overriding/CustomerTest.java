package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(10010, "이순신");
		customer1.bonusPoint = 1000;
		int price = customer1.calcPrice(1000);
		System.out.println(customer1.showCustomerInfo() + price);
		
		Customer customer2 = new VIPCustomer(10020, "김유신");
		customer2.bonusPoint = 10000;
		price = customer2.calcPrice(1000);
		System.out.println(customer2.showCustomerInfo() + price);
	}

}
