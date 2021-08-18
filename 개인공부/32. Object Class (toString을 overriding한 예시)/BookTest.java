package ch01;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// toString을 overriding함으로써 기본 인스턴스 출력값이 주소값이 아닌 아래의 return값으로 바꼈다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + ", " + author;
	}
	
	
}


public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("데미안", "헤르만 허세");
		
		System.out.println(book);
		// 결과값 : ch01.Book@24d46ca6
		// ch01 package의 Book class이다.
		// 인스턴스가 저장된 가상 메모리는 24d46ca6이다.
		
		String str = new String("test");
		System.out.println(str);
		// 위의 book과 같이 String object로 str이라는 인스턴스를 생성하였는데
		// 결과가 위와 다르게 주소값이 아닌 str의 문자열이 나온다.
		// 이렇게 나오는 이유는 String의 toString method가 overriding되었기 떄문이다.
		// Book Class도 toString method를 overriding을 하면 주소값이 아닌 결과 출력이 가능하다.
	}

}
