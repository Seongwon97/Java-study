package ch13_1;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	// Member를 comparable할 인터페이스를 구현
	
	
	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름

	public Member() {}
	
	public Member(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	// HashSet에서는 값이 같은지 판단하는 기준을 세워줘야 하기에
	// equals와 HashCode를 재정의 해야한다.
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}
	
	
	@Override
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	
	// Comparator의 compare는 매개변수가 2개로 하나는 자기 자신이고 다른 하나는 비교대상이다.
	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId -member2.memberId);
	}

}
