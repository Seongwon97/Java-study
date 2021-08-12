package myPackage;

public class HazardPay extends PayCalculator{
	HazardPay(double payRate){
		this.payRate=payRate;
	}
	public double computePay(double hours) {
		return 1.5*super.computePay(hours);
	}
}
