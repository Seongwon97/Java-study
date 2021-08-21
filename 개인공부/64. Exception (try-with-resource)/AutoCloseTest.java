package ch09;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj) {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("end");
	}

}
