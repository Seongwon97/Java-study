package ch04;
// node delete는 Python, C와 다르게 안해줘도 된다. Garbage collector가 나중에 알아서 수거를 해준다.
public class Node {
	private int data;
	public Node next;
	
	public Node() {
		this.data = (Integer) null;
		this.next = null;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node(int data, Node nextNode) {
		this.data = data;
		this.next = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
