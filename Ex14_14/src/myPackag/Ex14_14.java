package myPackag;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex14_14 {
		private static LinkedList<String> test=new LinkedList<String>();
		private static int front=0;
		private static int tail=0;
		private static int count=0;
	
		public static void addToQueue(String item) {
			test.add(tail,item);
			tail++;
			count++;
		}
		public static void removeFromQueue() {
			test.remove(front);
			front++;
			count--;
		}
		
		public static boolean isEmpty() {
			if(count==0)
				return false;
			else
				return true;
		}
		
		public static void main(String[] args) {
			Scanner kb=new Scanner(System.in);
			int choice;
			String data, garbage;
			while(true) {
				System.out.println("1.Enqueue 2.Dequeue 3.Exit");
				choice=kb.nextInt();
				switch(choice) {
				case 1:
					garbage=kb.nextLine();
					System.out.println("Enter the data.");
					data=kb.nextLine();
					addToQueue(data);
					for(int i=0; i<test.size();i++) {
						if(i==tail-1)
							System.out.print(test.get(i));
						else
							System.out.print(test.get(i)+"->");
					}
				System.out.println();
				break;
					
				case 2:
					removeFromQueue();
					for(int i=0; i<test.size();i++)
						System.out.print(test.get(i)+"->");
					System.out.println();
					break;
				
				case 3:
					System.out.println("End program!");
					System.exit(0);
				}
			}
		}

}
