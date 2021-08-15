package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library = new ArrayList<>();
		
		for (int i=1; i<6;i++) {
			library.add(new Book("태백산맥"+i, "조정래"));
		}
		
		for (int i=0;i<library.size(); i++) {
			library.get(i).showInfo();
		}
		
	}

}
