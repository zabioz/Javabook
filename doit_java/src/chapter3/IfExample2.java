package chapter3;

public class IfExample2 {

	public static void main (String [] args) {
		int age = 9;
		int charge;
	
	if (age< 8) {
		charge = 1000;
		System.out.println("child");
	}
		else if (age <14) {
			charge = 2000;
			System.out.println("element school student");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("middle, high school student");
		}
		else {
				charge = 3000;
				System.out.println("adult");
	}
	System.out.println("charge is " + charge + " is this");
	}
}

