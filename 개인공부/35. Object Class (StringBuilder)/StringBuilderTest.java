package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = new String("java");
		String android = new String("android");
		
		
		StringBuilder buffer = new StringBuilder(java); //java를 넣은 string buffer생성
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android); //java가 들어있는 buffer에 android를 추가러 넣어준다.
		System.out.println(System.identityHashCode(buffer));
		
		String test = buffer.toString(); // 연결을 마치고 toString으로 결과 return
		System.out.println(test);
	}

}
