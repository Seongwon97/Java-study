package ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		// 그냥 System.out.println(java.hashCode())를 하면 overriding된 hash값이 나와서
		// System.identityHashCode를 사용한다.
		// String의 equals, hashCode는 기본적으로 overriding이 되어있음
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		//11번 line과 16번 line의 결과가 다른 것을 통해 새로 문자열이 생성된 것을 알 수 있다.
		
	}
}

