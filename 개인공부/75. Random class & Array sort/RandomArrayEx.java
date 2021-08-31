package algorithm;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayEx {
	//https://m.blog.naver.com/royjs7778/221719403885
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Random array생성방법
		// 1번째 방법
		int[] arr = new int[10];
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
		}
		// Math라이브러리를 통해 random array생성
		System.out.println("Before Sort");
		for (int i: arr) {
			System.out.print(i + "\t");
		}
		System.out.println("\nAfter Sort");
		Arrays.sort(arr);
		for (int i: arr) {
			System.out.print(i + "\t");
		}
		
		
		// 2번째 방법 (Random class활용)
		int[] arr2 = new int[10];
		Random rand = new Random();
		
		for (int i=0;i<arr2.length;i++) {
			arr2[i] = rand.nextInt(100);
			// 괄호 안에는 범위 값을 대입
			// 위의 코드의 경우는 0~100사이의 수이다.
		}
		System.out.println("\nBefore Sort");
		for (int i: arr2) {
			System.out.print(i + "\t");
		}
		
		System.out.println("\nAfter Sort");
		Arrays.sort(arr2);
		for (int i: arr2) {
			System.out.print(i + "\t");
		}
		
		
		// Sort정리
		// Arrays.sort(arr, 0, 4); -> arr의 0,1,2,3 요소만 정렬 
		// 배열, 시작 index, 끝 index대입
		
		// 내림차순 정렬
		//  Arrays.sort(arr,Collections.reverseOrder());
		
		// 객체 배열정렬은 compareTo함수를 override해줘야한다.
	}

}
