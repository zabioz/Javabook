package chapter4;

public class PersonTest {
	public static void main (String[] args) {
		Person personkim = new Person();
		personkim.name = "kimyusin";
		personkim.weight = 85.5F;  //디트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		personkim.height = 180.0F;
		
		Person personlee = new Person("Leewo", 175, 75);  // 인스턴스 변수 초기화와 동시에 클래스 생성
		
	}

}
