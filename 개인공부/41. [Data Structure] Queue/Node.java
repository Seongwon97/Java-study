package ch05;
// node delete는 Python, C와 다르게 안해줘도 된다. Garbage collector가 나중에 알아서 수거를 해준다.
public class Node {
	private String data;
	public Node next;
	
	public Node() {
		this.data = null;
		this.next = null;
	}
	
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
	
	public Node(String data, Node nextNode) {
		this.data = data;
		this.next = nextNode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
