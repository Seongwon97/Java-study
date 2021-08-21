package ch09;

public class ArrayIndexExceptionTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		try { // Error가 발생할 수 있는 코드를 입력
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException :배열의 크기를 넘어선 위치를 참조하려는 경우 발생
			// 해당 exception이 발생하면 e라는 변수로 넘어온다~
			System.out.println(e.toString());
			// Result: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		}
	}
}
