package ch21;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length;i++) {
			library[i] = new Book("태백산맥"+i, "조정래");
		}
		
		for(Book book: library) {
			System.out.println("\n"+ book);
			book.showInfo();
		}
	}

}
