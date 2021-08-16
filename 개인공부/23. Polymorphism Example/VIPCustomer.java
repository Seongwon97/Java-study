package ch06;

public class VIPCustomer extends Customer{
	
	private String agentId;
	double saleRatio;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio);
		return price;
	}
	
	public String getAgentId() {
		return agentId;
	}
}
