package ch07;

public class CharacterTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		int ch4 = -67; //음수라서 문자로는 커버 불가!
		System.out.println(ch4);
		System.out.println((char)ch4);
		
		char han = '한';
		char ch = '\uD55C'; //'한'을 Unicode로 표현한 코드
		System.out.println(han);
		System.out.println(ch);
	}
}
