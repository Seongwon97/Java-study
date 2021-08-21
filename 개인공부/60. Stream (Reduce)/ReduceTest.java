package ch07;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		// TODO Auto-generated method stub
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		
		// reduce function에서 람다식을 사용한 예시
		System.out.println(Arrays.stream(greetings).reduce("",(s1, s2) ->
				{if (s1.getBytes().length >= s2.getBytes().length) return s1;
				else return s2; }
				));
		
		
		// BinaryOperator를 사용한 예시
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
	}	

}
