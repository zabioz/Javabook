package chapter7;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("태백삭맥", "조정래");
		library[1] = new Book("데미안", "헤르만헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경래");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for(int i = 0; i < library.length; i++) {
			
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			
			System.out.println(library[i]);
		}
	}
}
