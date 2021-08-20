package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	// member를 arraylist로 관리하기 위해 만든 class
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
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
		
		Iterator<Member> ir = arrayList.iterator();
		// <>안에는 반복 할 자료형을 입력
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId){
				arrayList.remove(member); 
				// 위의 코드에서는 index를 지정하여 remove한 코드
				// 현재 코드는 iterator를 member object를 사용하기에 object를 빈칸에 입력
				return true;                  
			}
		}
		
		
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false;                   
	}

	public void showAllMember() {
		for (Member member: arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
