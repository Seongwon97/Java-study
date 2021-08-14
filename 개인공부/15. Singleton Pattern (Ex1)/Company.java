package ch18;

public class Company {
	/* 생성자를 따로 지정안하면 default생성자가 public으로 생성되는데
	singleton에서는 외부에서 마음대로 사용하지못하도록 private으로 생성자를 생성한다.
	그리고 유일한 인스턴스는 내부에서 만든다.
	*/ 
	private Company() {
		
	}
	
	private static Company instance = new Company(); 
	//유일한 인스턴스는 내부에서 만든다.
	
	
	// 인스턴스를 사용할 수 있도록 해주는 public함수
	// 싱글톤 패턴에서 유일한 인스턴스이기 때문에 미리 생성하고 외부에서 호출해야해서 static으로 지정한다.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
