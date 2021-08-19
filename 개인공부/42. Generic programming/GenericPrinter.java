package ch06;

public class GenericPrinter<T> {
	// T는 자료형 매개변수로 이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정하며 static 변수는 사용할 수 없다
	
	private T material;
	// 나중에 사용할 때 사용할 자료형을 입력하면 해당 자료형으로 생성된다.

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
}
