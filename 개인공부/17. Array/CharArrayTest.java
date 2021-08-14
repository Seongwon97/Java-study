package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i=0; i< alpahbets.length; i++) {
			alpahbets[i] = ch++;
		}
		
		for(int i = 0; i<alpahbets.length; i++) {
			System.out.println(alpahbets[i] +","+ (int)alpahbets[i]);
		}

	}

}
