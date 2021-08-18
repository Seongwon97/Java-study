package ch03;

public class MyArrayTest {

	public static void main(String[] args) {
		
		MyArray arr = new MyArray(10);
		
		System.out.println(arr.ARRAY_SIZE);
		
		arr.addNum(10);
		arr.addNum(9);
		arr.addNum(8);
		arr.addNum(7);
		
		arr.insertNum(2, 3);
		arr.insertNum(5, 5);
		
		arr.remove(3);
		arr.remove(4);
	}
}
