package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer();
		customer1.setCustomerName("이순신");
		customer1.setCustomerId(10010);
		customer1.bonusPoint = 1000;
		System.out.println(customer1.showCustomerInfo());
		
		VIPCustomer customer2 = new VIPCustomer();
		customer2.setCustomerName("김유신");
		customer2.setCustomerId(10020);
		customer2.bonusPoint = 10000;
		System.out.println(customer2.showCustomerInfo());
	}

}
