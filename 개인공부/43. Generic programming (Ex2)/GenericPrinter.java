package ch07;

public class GenericPrinter<T extends Material> {
	// extends Material을 하여 T에 대한 제한을 하였다.
	// Material을 상속받은 Class(자료형)으로만 생성 가능하다!!
	
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
