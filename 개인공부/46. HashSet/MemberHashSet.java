package ch12;

import java.util.HashSet;
import java.util.Iterator;
// HashSet은 집합처럼 동일한 값이 들어오는 것을 막을 수 있다.
// 하지만 동일한 값은 equals, hashCode를 재정의하며 직접 정해줘야한다.
public class MemberHashSet {
	// member를 HashSet로 관리하기 위해 만든 class
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	
	public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		/*
		for(int i =0; i<arrayList.size(); i++){ // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(i);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		*/
		
		Iterator<Member> ir = hashSet.iterator();
		// <>안에는 반복 할 자료형을 입력
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId){
				hashSet.remove(member); 
				// 위의 코드에서는 index를 지정하여 remove한 코드
				// 현재 코드는 iterator를 member object를 사용하기에 object를 빈칸에 입력
				return true;                  
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false;                   
	}

	

	
	

	public void showAllMember() {
		for (Member member: hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
