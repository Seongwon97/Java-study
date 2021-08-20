package ch13_1;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	// member를 treeSet로 관리하기 위해 만든 class
	
	private TreeSet<Member> treeSet;
	// treeSet에 사용할 자료형은 무조건 comparable을 구현해야한다.
	// 단 String, integer과 같이 jdk에서 이미 구현된것들은 안해도 된다. 
	public MemberTreeSet() {
		// comparator를 사용할때는 반드시 괄호 안에 comparator가 구현된 것을 써줘야한다.
		treeSet = new TreeSet<>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	
	public boolean removeMember(int memberId){

		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId){
				treeSet.remove(member); 
				return true;                  
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;                   
	}


	public void showAllMember() {
		for (Member member: treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
