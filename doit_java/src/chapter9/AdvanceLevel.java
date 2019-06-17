package chapter9;

public class AdvanceLevel extends PlayerLevel {
	@Override
	public void run() {
	System.out.println("runnig");	
	}
	@Override
	public void jump() {
	System.out.println("high jumping");	
	}
	@Override
	public void turn() {
	System.out.println("can not turn");	
	}
	@Override
	public void showLevelMessage() {
	System.out.println("== Advance level ==");	
	}
}
