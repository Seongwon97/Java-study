package ch09;

public class AutoCloseableObj implements AutoCloseable {
	
	// AutoCloasble을 implement하면 close를 overriding해야한다.
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("closing...");
	}
	
}
