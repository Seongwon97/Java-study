package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Powder powder = new Powder();
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		// <>안에 사용하고자 하는 자료형을 입력해주면 된다.
		// <>를 생략하게 되면 해당 인스턴스는 Object로 생성된다. 
	
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		// Generic programming을 하지 않고 Object를 사용한 경우 아래와 같이 형 변환이 필요하다.
		// Powder p = (Powder)printer.getMaterial();
		// 하지만 generic programming의 경우는 컴파일이 될 때 T가 전부 Powder로 변하여 형 변환이 필요없다.
		
		System.out.println(powderPrinter);
		// 결과: 재료는 powder입니다. 

	}

}
