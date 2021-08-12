package ch12;

public class ShortCircuit {
// 논리연산에서 모든 연산이수행되지 않는 경우를 short circuit evaluation이라고 한다.
// &&연산의 경우 앞의 항이 false이면 뒤의 항은 계산하지 않으며
// ||연산의 경우 앞의 항이 True면 뒤의 항을 계산하지 않는다. 
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // i값이 +2가 되지 않은 것을 보아 short circuit evaluation을 확인할 수 있다.
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //앞의 항이 False면 뒤에 항을 실행,  True면 실행하지 않는다.
		
	}
}

