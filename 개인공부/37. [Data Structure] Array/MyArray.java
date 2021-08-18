package ch02;
/*
 * 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
 * 정해진 크기가 있음
 * 요소의 추가와 제거시 다른 요소들의 이동이 필요함
 * 배열의 i 번째 요소를 찾는 인덱스 연산이 빠름
 * jdk 클래스 : ArrayList, Vector
 * */
public class MyArray {

	int[] arr;
	int count;
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		arr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		arr = new int[ARRAY_SIZE];
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	// 값 대입
	public void addNum(int value) {
		if (count >= ARRAY_SIZE) {
			System.out.println("The array is full");
		}
		else {
			arr[count] = value;
			count++;
			printArray();
		}
	}
	
	// 특정 위치에 값 대입
	public void insertNum(int position, int value) {
		if (count >= ARRAY_SIZE) {
			System.out.println("The array is full");
		}
		else if((position > count) || (position < 0)) {
			System.out.println("The position is out of range");
		}
		else {
			
			for (int i=(count-1); i>=position; i--) {
				arr[i+1] = arr[i];
			}
			arr[position] = value;
			count++;
			printArray();
		}
	}
	
	// 특정 위치의 값 삭제
	public void remove(int position) {
		if (isEmpty()) {
			System.out.println("The array is empty!");
		}
		else if((position >= count) || (position < 0)) {
			System.out.println("The position is out of range");
		}
		else if(position+1 == count) {
			arr[--count] = 0;
			printArray();
		}
		else {
			for (int i=position; i<count;i++) {
				arr[i] = arr[i+1];
			}
			arr[--count] = 0;
			printArray();
		}
	}
	
	
	// 값 전부 삭제
	public void removeAll() {
		for(int i=0; i < count; i++) {
			arr[i] = 0;
		}
		count = 0;
	}
	
	// array가 비었는지 체크
	public boolean isEmpty() {
		if (count < 1) 
			return true;
		else
			return false;
	}
	
	// 특정 위치의 값 return
	public int returnData(int position) {
		if (isEmpty()) {
			System.out.println("The array is empty!");
			return -1;
		}
		else if((position >= count) || (position < 0)) {
			System.out.println("The position is out of range");
			return -1;
		}
		else return arr[position];
	}
	
	public void printArray() {
		for (int num: arr) {
			System.out.print(num+ "   ");
		}
		System.out.println();
	}
	
}
