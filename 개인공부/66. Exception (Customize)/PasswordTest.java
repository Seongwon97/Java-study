package ch10;

public class PasswordTest {
	
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws PasswordException {
		// 이와 같이 exception을 만들고 상황에 따른 exception을 발생시킬 수 있다.
		if (password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if (password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = password;
	}
	
	
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		// password가 null인 것을 test
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류없음1");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		// 문자열이 5개 미만이고 특수문자가 없는 것 테스트
		password = "abc";
		try {
			test.setPassword(password);
			System.out.println("오류없음2");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		// 문자열이 5개 이상이지만 특수문자가 없는 것 테스트
		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("오류없음3");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		// 정상적인 것 테스트
		password = "abcde1#";
		try {
			test.setPassword(password);
			System.out.println("오류없음4");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
