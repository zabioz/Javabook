package chapter9;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
	System.out.println("slow runnig");	
	}
	@Override
	public void jump() {
	System.out.println("can not jumping");	
	}
	@Override
	public void turn() {
	System.out.println("can not turn");	
	}
	@Override
	public void showLevelMessage() {
	System.out.println("== beginner level ==");	
	}
}
