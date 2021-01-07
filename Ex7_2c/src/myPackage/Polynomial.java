package myPackage;

public class Polynomial {
	private int degree;
	private double[] arr;
	private double result = 0;
	
	public void polynomial(int max) {
		degree=max;
		arr= new double[degree+1];
		for(int i=0; i<arr.length; i++) {
			arr[i]=0;
		}
	}
	public void setConstant(int i, double value) {
		arr[i]=value;
	}
	public double[] getArr() {
		return arr;
	}
	public double exalute(int x) {
		int square;
		for(int i=0; i<arr.length; i++) {
			if(i==0)
				square=1;
			else {
				square=1;
				for(int j=1; j<=i;j++)
					square=square*x;
			}
			result=result+(arr[i]*square);
		}
		return result;
	}
}
