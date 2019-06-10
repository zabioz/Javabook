package chapter3;

public class SwitchCase2 {
	public static void main(String [] args) {
	
		String medal = "Gs";
		
		switch(medal) {
		case "Gold" :
		System.out.println("G");
		break;
		
		case "Silver" :
			System.out.println("S");
			break;

		case "blonze" :
			System.out.println("B");
			break;

		default :
			System.out.println("not");
			break;

		}
	}
}
