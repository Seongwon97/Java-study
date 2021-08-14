package ch20;

public class ArrayTest {
	public static void main(String[] args) {
		// int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] arr = new int[10];
		// 배열은 생성과 동시에 초기화가된다. 
		// int는 0, double은 0.0, 객체는 null로 초기화됨
		int total = 0;
		
		for(int i=0, num=1; i<arr.length; i++) {
			arr[i] = num++;
		}
		
		for (int num : arr) { //arr의 있는게 하나씩 num으로 해서 돌아감
			total += num;
		}
		
		System.out.println(total);
	}
}
