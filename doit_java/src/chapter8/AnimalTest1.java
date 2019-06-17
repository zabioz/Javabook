
package chapter8;

class Animal {
	public void move() {
		System.out.println("animl move");
	}
}

class Human extends Animal{
	public void move () {
		System.out.println("Human is move. ");
	}
}
		
class Tiger extends Animal {
	public void move() {
	
		System.out.println("Tiger is move");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("Eagle is move");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}