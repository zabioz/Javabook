package chapter7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("book1", "ichi"));
		library.add(new Book("book2", "ni"));
		library.add(new Book("book3", "san"));
		library.add(new Book("book4", "si"));
		library.add(new Book("book5", "go"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		System.out.println("향상된 for문");
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
