package ch08;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날라다닙니다.");
	}
}



public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();

		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for (Animal ani: animalList) {
			ani.move();
		}
		System.out.println();
		test.testDownCasting(animalList);
		
	}
	public void testDownCasting(ArrayList<Animal> list) {
		for (int i=0;i<list.size();i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}

		}
		
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move(); 
		// 코드는 한 줄인데 어떤 값이 들어가느냐에 따라 move의 수행이 달라진다.
		// 이게 다형성!!
	}

}
