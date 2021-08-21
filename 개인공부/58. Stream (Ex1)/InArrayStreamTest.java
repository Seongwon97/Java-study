package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		for (int num: arr) {
			System.out.println(num);
		}
		
		System.out.println();
		
		Arrays.stream(arr).forEach(n-> System.out.println(n));
		// Stream과 람다식을 사용하여 위의 코드와 같은 결과를 낼 수 있다.
		
		IntStream is = Arrays.stream(arr);
		// IntStream 인스턴스를 생성하여 is.~ 을 통해 연산자들을 사용할 수도 있다.
		is.forEach(n-> System.out.println(n));
		
		// Stream은 한번 사용하면 더이상 사용을 못하고 새로 만들어줘야한다.
		// is Stream은 위에서 사용을 했기에 다시 사용하려고 하면 오류가 발생한다.
		// is.forEach(n-> System.out.println(n));
	}

}
