package ch04;

import ch02.MyArray;

public class MyArrayStack {
	
	MyArray arrayStack;
	
	int top;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	// 데이터 삽입
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		
		arrayStack.addNum(data);
		top++;
	}
	
	// 데이터 삭제
	public void pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		arrayStack.remove(--top);
		
	}
	
	// 맨 위에 위치한 데이터 출력
	public void peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		System.out.println("Peek: "+arrayStack.returnData(top-1));
		
	}
	
	public void printAll() {
		arrayStack.printArray();
	}
	
	public boolean isFull() {
		if (top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		else
			return false;
	}
}
