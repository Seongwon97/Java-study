package ch06_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s-> System.out.println(s));

		System.out.println();
		
		//14,15라인의 Stream은 한번 사용하여 재사용 불가, 아래에서는 새로 생성
		sList.stream().sorted().forEach(s-> System.out.print(s + "\t"));
		
		System.out.println("\n");
		sList.stream().map(s->s.length()).forEach(n-> System.out.print(n + "\t"));
		// map은 요소를 변환하기 위해 사용
		
		System.out.println("\n");
		sList.stream().filter(s->s.length() >= 5).forEach(n-> System.out.print(n + "\t"));
		// filter는 조건문과 같은 것
	}
}
