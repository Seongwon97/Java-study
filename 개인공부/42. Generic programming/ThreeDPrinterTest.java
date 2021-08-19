package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		Powder p = (Powder)printer.getMaterial();
		// ThreeDPrinter3의 경우는 Object type을 이용하여 material을 만들었는데
		// 이럴 경우 형 변환을 해줘야해서 번거로움이 발생한다.
		// 그래서 generic programming이 생겨났다.
		
	}

}
