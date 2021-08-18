package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student st1 = new Student(100, "Lee");
		Student st2 = new Student(100, "Lee");
		
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
		// 값들이 같음에도 불구하고 물리적으로 저장된 주소값이 달라서 false라는 결과가 나온다.
		// Student의 equals method를 studentNum값이 같으면 같다고 판별하라고 overriding을 한 뒤에는 true로 return
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		// overriding전에는 hashCode의 값도 다른 값 출력
		// hashcode를 overriding을 한 뒤에는 hashcode값도 동일하게 출력한다.
		
		System.out.println(System.identityHashCode(st1));
		// System.identityHashCode를 통해 실제로 st1이 갖는 실제 hashCode값을 찾을 수 있다.
		
		
		st1.setStudnetName("Kim");
		// clone을 통해 st1의 현재상태와 동일한 인스턴스인 copyStudent 인스턴스를 생성
		Student copyStudent = (Student)st1.clone();
		System.out.println(copyStudent);
	}

}
