package chapter9;

public class AICar extends Car{
	@Override
	public void drive() {
		System.out.println("auto drive");
		System.out.println("auto is car turn");
	}

	@Override
	public void stop() {
		System.out.println("auto stop");
	}
}
