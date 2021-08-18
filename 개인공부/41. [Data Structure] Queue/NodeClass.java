package ch05;

public class NodeClass{
	
	private Node head;
	int count;
	
	public NodeClass() {
		head = null;
		count = 0;
	}
	
	//가장 끝쪽에 node추가
	public Node addNode(String data) {
		Node newNode = new Node(data);
		// head가 없을때
		if (head == null) {
			head = newNode;
			
		}
		// 그냥 뒤에 넣을때
		else {
			Node temp = head;
			while (temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
			
		}
		count++;
		printNode();
		
		return newNode;
	}
	
	// 특정 위치에 node추가
	public void inserNode(int position, String data) {

		if (head == null) {
			System.out.println("The list is empty");
		}
		else if((count+1 < position) || (0 >= position)) {
			System.out.println("The positoin is out of range");
		}
		else if(position == 1) {
			Node newNode = new Node(data, head);
			head = newNode;
			count++;
		}
		else {
			Node tempNode = head;
			for (int i=1; i<(position-1); i++)
				tempNode = tempNode.next;
			
			Node newNode = new Node(data, tempNode.next);
			tempNode.next = newNode;
			count++;
			printNode();
		}
	}
	
	// 특정 위치의 node삭제
	public void remove(int position) {
		if (head == null) {
			System.out.println("The list is empty");
		}
		else if((count < position) || (0 >= position)) {
			System.out.println("The positoin is out of range");
		}
		else if(position == 1) {
			head = head.next;
			count--;
			printNode();
		}
		else {
			Node tempNode = head;
			for (int i=1; i<(position-1); i++)
				tempNode = tempNode.next;
			
			tempNode.next = tempNode.next.next;
			count--;
			printNode();
		}
	}
	
	// 마지막 위치의 node삭제
	public void removeLast() {
		if (head == null) {
			System.out.println("The list is empty");
		}
		
		else {
			Node tempNode = head;
			while (tempNode.next.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = null;
			count--;
			printNode();
		}
	}
	
	// node print
	public void printNode() {
		
		if (head == null) {
			System.out.println("The list is empty");
		}
		
		Node tempNode = head;
		
		
		while(tempNode!=null) {
			System.out.print(tempNode.getData()+"  ");
			tempNode = tempNode.next;
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		if (head==null) return true;
		else return false;
	}
	
	
}
