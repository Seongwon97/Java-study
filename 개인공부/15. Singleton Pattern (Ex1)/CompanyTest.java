package ch18;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		// 하나의 인스턴스로 생성한 것이기 때문에 주소공간이 같다.
	}

}
