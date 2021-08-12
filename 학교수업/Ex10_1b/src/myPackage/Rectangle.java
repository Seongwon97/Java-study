package myPackage;

public class Rectangle implements Shape{
	private int width,height;
	Rectangle(int newWidth, int newHeight){
		width=newWidth;
		height=newHeight;
	}
	
	public double getArea() {
		return width*height;
	}
	
    public String toString() {
        return String.format("Rectangle\nwidth: %d, height: %d\n", width,height);
    }
    
    public boolean equals(Object otherObject) {
        if (!(otherObject != null && otherObject instanceof Rectangle))
            return false;
        Rectangle ex = (Rectangle)otherObject;
        return this.width==ex.width && height==ex.height;
        }

}
