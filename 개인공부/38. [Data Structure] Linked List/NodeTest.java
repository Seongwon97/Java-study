package ch04;

public class NodeTest {
	// list 위치는 1부터 시작되도록 구현하였음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeClass list = new NodeClass();
		list.printNode();
		list.addNode(5);
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.inserNode(1, 10);
		list.inserNode(5, 9);
		list.inserNode(7, 13);
		
		list.removeLast();
		list.removeLast();
		list.remove(2);
		
		list.remove(3);
		
	}

}
