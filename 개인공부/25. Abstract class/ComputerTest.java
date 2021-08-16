package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Computer desktop = new Computer();
		// 추상 class는 new를 통해 새로운 instance를 만들 수 없다.
		
		Computer desktop = new Desktop();
		desktop.display();
		desktop.typing();
		
	}

}
