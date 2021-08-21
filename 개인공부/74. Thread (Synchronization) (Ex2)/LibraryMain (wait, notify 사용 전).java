package ch23;

import java.util.ArrayList;
// 책이 없으면 기다리지 않고 빌리지 않게 하는 코드
class FastLibrary{
	public ArrayList<String> shelf = new ArrayList();
	
	public FastLibrary() {
		shelf.add("태백산맥 1");
		shelf.add("태백산맥 2");
		shelf.add("태백산맥 3");
		shelf.add("태백산맥 4");
		shelf.add("태백산맥 5");
	}
	
	public synchronized String lenBook() {
		Thread t = Thread.currentThread();
		
		if(shelf.size() > 0) {
			// ArrayList에서 0번째 있는 책을 대여
			String book = shelf.remove(0);
			System.out.println(t.getName() + ": "+ book + " lend");
			return book;
		}
		else return null;
		
	}
	
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		shelf.add(book);
		
		System.out.println(t.getName() + ": "+ book + " return ");
	}
}

// 책을 빌리는 학생 class (Thread로 구현)
class Student extends Thread {
	
	public Student(String name) {
		super(name);
	}
	public void run() {
		try {
			String title = LibraryMain.library.lenBook();
			if(title == null) {
				System.out.println(getName()+" 빌리지 못했음");
				return;
			}
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

public class LibraryMain {
	
	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("std1 ");
		Student std2 = new Student("std2 ");
		Student std3 = new Student("std3 ");
		Student std4 = new Student("std4 ");
		Student std5 = new Student("std5 ");
		Student std6 = new Student("std6 ");
		
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		// 책의 개수가 5개인데 6명이 빌리려고 하면 자원이 없어서 exception발생
	}

}
