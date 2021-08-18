package ch04_1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 아래의 방법으로도 LinkedList생성 가능
		LinkedList<Integer> coffeeMenu = new LinkedList<Integer>(); // 타입 지정, 일반적인 방법
		LinkedList<Integer> integers2 = new LinkedList<>(); // 타입 생략 가능
		LinkedList<Integer> integers3 = new LinkedList<>(coffeeMenu); // 다른 Collection값으로 초기화
		LinkedList<Integer> integers4 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList()
		*/
		LinkedList<String> coffeeMenu = new LinkedList<String>();
		
		// add를 통해 element추가가 가능하다.
		coffeeMenu.add("아메리카노");
		coffeeMenu.add("카푸치노");
		
		// add의 경우 (index, value)의 순으로 parameter를 주며 index값을 주지 않을 경우 맨 뒤에 붙게된다.
		// index의 경우 array와 똑같이 0부터 시작.
		coffeeMenu.add(1,"마끼야또");
		coffeeMenu.add(1,"아포가토");
		coffeeMenu.add(2,"아이스티");
		
		System.out.println(coffeeMenu+"\n");
		
		// 데이터 삭제는 remove method를 통해 할 수 있다.
		// remove의 parameter는 index값 또는 실제 값을 입력할 수 있으며
		// parameter를 주지 않았을 경우 맨 앞의 수가 삭제된다.
		// remove는 삭제한 값을 return함으로 return값을 받을 수도 있다.
		System.out.println("Delete "+coffeeMenu.remove(3));
		System.out.println(coffeeMenu+"\n");
		
		System.out.println("Delete "+coffeeMenu.remove("카푸치노"));
		// 실제 값을 통해 삭제를 하는 경우 return값은 true/false로 return한다.
		// 그 외의 index값이나 아무 값도 입력하지 않았을 때는 삭제되는 값을 return
		System.out.println(coffeeMenu+"\n");
		
		String deleteMenu = coffeeMenu.remove();
		System.out.println("Delete "+ deleteMenu);
		System.out.println(coffeeMenu+"\n");
		
		// 모든 값을 삭제하고 싶다면 clear()를 호출하면 된다.
		
		
		// linked list값 출력 (for문 이용 예시)
		for(String menu:coffeeMenu) {
			System.out.print(menu+"  ");
		}
		
		// linked list값 출력 (Iterator이용 예시)
		Iterator<String> iterator = coffeeMenu.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "  ");
		}
		
 	}

}
