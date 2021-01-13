package myPackage;

public class Circle extends Shape{
	private int rad;
	Circle(int newRad){
		rad=newRad;
	}
	
	public double getArea() {
		return Math.PI*(double)(rad*rad);
	}
	
    public String toString() {
        return String.format("Circle\nradius: %d\n", rad);
    }
    
    public boolean equals(Object otherObject) {
        if (!(otherObject != null && otherObject instanceof Circle))
            return false;
        Circle ex = (Circle)otherObject;
        return this.rad==ex.rad;
        }

}
