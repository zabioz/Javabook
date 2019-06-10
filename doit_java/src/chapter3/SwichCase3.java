package chapter3;

public class SwichCase3 {
	public static void main(String [] args) {
	
	int floor = 1;
	String name;
	
	switch(floor) {
	case 1 : name = "supermarket";
		break;
	case 2 : name = "office";
	break;
	
	case 3 : name = "carcenter";
	break;
	
	default :
		name = "not";
		System.out.println("not");
	}
	System.out.println(floor + " floor is " + name);
	}
}
