package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayStack stack = new MyArrayStack(3);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.pop();
		stack.pop();
		
		stack.peek();
		
		stack.pop();
		stack.pop();
		
		
	}

}
