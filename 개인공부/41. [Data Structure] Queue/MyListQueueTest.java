package ch05;

public class MyListQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedQueue listQueue = new MyLinkedQueue();
		
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		listQueue.enQueue("D");
		
		
		listQueue.deQueue();
		listQueue.deQueue();
		listQueue.deQueue();
		listQueue.deQueue();
		
	}

}
