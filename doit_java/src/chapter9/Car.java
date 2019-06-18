package chapter9;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
	System.out.println(" switch on ");
	}
	
	public void turnOff() {
		System.out.println(" switch off ");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
