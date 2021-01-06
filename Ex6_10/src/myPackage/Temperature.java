package myPackage;

public class Temperature {
	private double degree;
	private char scale;
	
	Temperature(double newDegree){
		degree = newDegree;
		scale = 'C';
	}
	Temperature(char newScale){
		degree = 0;
		scale = newScale;
	}
	Temperature(double newDegree, char newScale){
		degree = newDegree;
		scale = newScale;
	}
	Temperature(){
		degree = 0;
		scale = 'C';
	}
	public void setDegree(double newDegree) {
		degree = newDegree;
	}
	public void setScale(char newScale) {
		scale = newScale;
	}
	public void setBoth(double newDegree, char newScale) {
		degree = newDegree;
		scale = newScale;
	}
	public void toFahrenheit() {
		if (scale=='C') {
			degree= (degree*1.8) + 32;
			scale='F';
		}
	}
	public void toCelsius() {
		if (scale=='F') {
			degree= (degree-32) / (1.8);
			scale='C';
		}
	}
	public double getDegree() {
		return degree;
	}
	public boolean equal(double degree1) {
		return (degree==degree1);
	}
	public boolean greater(double degree1) {
		return (degree>degree1);
	}
	public boolean less(double degree1) {
		return (degree<degree1);
	}
	public char getScale() {
		return scale;
	}
}
