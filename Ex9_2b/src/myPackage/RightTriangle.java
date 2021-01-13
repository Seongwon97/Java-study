package myPackage;

public class RightTriangle extends Shape{
	private int width,height;
	RightTriangle(int newWidth, int newHeight){
		width=newWidth;
		height=newHeight;
	}
	
	public double getArea() {
		return width*height/2;
	}
	
    public String toString() {
        return String.format("RightTriangle\nwidth: %d, height: %d\n", width,height);
    }
    
    public boolean equals(Object otherObject) {
        if (!(otherObject != null && otherObject instanceof RightTriangle))
            return false;
        RightTriangle ex = (RightTriangle)otherObject;
        return this.width==ex.width && height==ex.height;
        }
}
