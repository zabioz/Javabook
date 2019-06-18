package chapter7;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[ ] strArray = {"Java", "Android", "C", "JS", "Python" };
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}
}
