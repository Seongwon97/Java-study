package ch12;

public class ShortCircuit {
// �����꿡�� ��� �����̼������ �ʴ� ��츦 short circuit evaluation�̶�� �Ѵ�.
// &&������ ��� ���� ���� false�̸� ���� ���� ������� ������
// ||������ ��� ���� ���� True�� ���� ���� ������� �ʴ´�. 
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // i���� +2�� ���� ���� ���� ���� short circuit evaluation�� Ȯ���� �� �ִ�.
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //���� ���� False�� �ڿ� ���� ����,  True�� �������� �ʴ´�.
		
	}
}

