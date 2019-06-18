package chapter9;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
	System.out.println("high speed runnig");	
	}
	@Override
	public void jump() {
	System.out.println("very high jumping");	
	}
	@Override
	public void turn() {
	System.out.println("turnning");	
	}
	@Override
	public void showLevelMessage() {
	System.out.println("== Super level ==");	
	}
}
