package ch21;
/*
 * 주소값까지 다르게 새로운 인스턴스를 생성하는 깊은 복사
 * */
public class ObjectCopyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		for(int i=0; i<library.length;i++) {
			library[i] = new Book("태백산맥"+i, "조정래");
		}
		
		for(int i=0; i<copyLibrary.length;i++) {
			copyLibrary[i] = new Book();
		}
		
		
		for (int i=0; i<copyLibrary.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		System.out.println("==Library==");
		for(Book book: library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("\n== Copy Library==");
		for(Book book: copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
