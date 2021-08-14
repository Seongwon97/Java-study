package ch21;
/*
 * 주소값만 복사를 하여 같은 주소를 가리키게하는 얕은 복사
 * */
public class ObjectCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		for(int i=0; i<library.length;i++) {
			library[i] = new Book("태백산맥"+i, "조정래");
		}
		
		// System.arrayCopy(src, srcPos, dest, destPos, length)
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		// 얕은 카피로 주소만 복사된다.
		// 깊은 복사를 하려면 10~12번째줄처럼 따로 인스턴스를 만들고 값만 따로 복사를 해줘야한다.
		
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
