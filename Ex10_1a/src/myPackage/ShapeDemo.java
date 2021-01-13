package myPackage;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shape=new Shape[3];
		shape[0]=new Circle(3);
		shape[1]=new Rectangle(3,4);
		shape[2]=new RightTriangle(3,4);
		for(int i=0;i<3;i++) {
			System.out.print(shape[i].toString());
			System.out.println("Area: "+shape[i].getArea());
		}
	}

}
