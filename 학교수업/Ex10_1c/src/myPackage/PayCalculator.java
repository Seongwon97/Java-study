package myPackage;

public abstract class PayCalculator {
	double payRate;
	public double computePay(double hours) {
		return payRate*hours;
	}
}
