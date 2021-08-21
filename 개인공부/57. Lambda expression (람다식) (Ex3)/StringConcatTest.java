package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		// 람다식을 사용하지 않은 일반적인 객체지향 프로그래밍 방법!!
		// Interface생성, interface를 구현하는 class생성, 해당 클래스로 instance를 생성하고 사용
		
		
		StringConcat concat = (s, v)-> System.out.println(s + ", " + v);
		concat.makeString(s1, s2);
		// 객체지향과 비교했을때 class를 생성하는 과정이 생략되었다.
		// class가 생성안된다고 생각을 하겠지만 내부적으로 익명 class가 생성되어지게 된다.
		// class생성은 개발자가 직접 프로그래을 하는 과정만 생략된 것이다.
		// *람다식 함수형 인터페이스에는 하나의 메서드만 가능!!
	}

}
