package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1003, "강감찬");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberHong);
		
		
		memberHashSet.showAllMember();
		
		memberHashSet.removeMember(memberKim.getMemberId());
		memberHashSet.showAllMember();

	}

}
