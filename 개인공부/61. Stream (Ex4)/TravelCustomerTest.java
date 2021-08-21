package ch08;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
	// Stream을 사용하지 않는다면 아래의 코드를 if문을 사용하여 구현하여야하며
	// 코드의 길이가 매우 길어질 것이다.
	// Stream을 사용하여 간결한 코드를 생성할 수 있으나 
	// 우리가 익숙하지 않은 람다식을 사용해야한다는 단점이 있다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCustomer customerOh = new TravelCustomer("오성원", 25, 100);
		TravelCustomer customerKim = new TravelCustomer("김명원", 20, 100);
		TravelCustomer customerLee = new TravelCustomer("이정우", 24, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerOh);
		
		System.out.println("고객 명단 출력");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("\n여행비용 출력");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println("\n23세 이상 고객");
		customerList.stream().filter(c->c.getAge() >= 23).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		// sorted같은 경우는 해당 객체에 대해 comparable이 구현되어 있지 않으면 구현을 해줘야한다.
		
	}

}
