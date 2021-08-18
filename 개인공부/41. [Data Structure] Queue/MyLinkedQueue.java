package ch05;


interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printAll();
}
public class MyLinkedQueue extends NodeClass implements Queue{
	
	Node front;
	Node rear;
	
	
	@Override
	public void enQueue(String data) {
		// TODO Auto-generated method stub
		Node newNode;
		if(isEmpty()) {
			newNode = addNode(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addNode(data);
			rear = newNode;
		}
		
		System.out.println(newNode.getData() + " added");
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			return null;
		}
		
		String data = front.getData();
		front = front.next;
		
		if (front == null) {
			rear =null;
		}
		System.out.println(data + " is deleted");
		return data;
	}

	@Override
	public void printAll() {
		printAll();
		
	}
	
	
}
