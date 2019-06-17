package chapter9;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("===auto driving car===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("===human driving car===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}
}
