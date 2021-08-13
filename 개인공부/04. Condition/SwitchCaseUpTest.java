package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		
		int month = 3;
		
		int day = switch (month) {
	    	case 1, 3, 5, 7, 8, 10,12 -> { // case1: case2: ~~��� case1,2,3,4~�� ����ϸ� ������ �������� ��� {}�� ����Ѵ�.
	    		System.out.println("�� ���� 31���Դϴ�."); 
	    		yield 31; // return��� yield�� ���
	    		//break�� ��� �ȴ�.
	    	}
	    	case 4,6,9,11 -> {
	    		System.out.println("�� ���� 30���Դϴ�."); 
	    		yield 30;
	    	}
	    	case 2 ->{
	    		System.out.println("�� ���� 28���Դϴ�.");
	    		yield 28;
	    	}
	    	default->{
	    		System.out.println("�������� �ʴ� �� �Դϴ�."); 
	    		yield 0;
	    	}
		}; //���� ���� ;�� �ʿ�
		System.out.println(month + "���� " + day + "���Դϴ�.");
	}
}
