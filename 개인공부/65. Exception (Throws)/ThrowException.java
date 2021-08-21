package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
	// Class 클래스를 사용
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		
		// throws를 통해 코드를 실제로 사용하는 곳에서 예외 처리를 하도록 미루었다.
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException test = new ThrowException();
		
		try {
			test.loadClass("a.txt", "abc");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("end");
	}

}
