package chapter12;

public class CharacterEx1 {

	public static void main (String[] args) {
	
		char ch1 = 'A';
		System.out.println(ch1); //문자 출력
		System.out.println((int)ch1); //문자에 해당하는 정수(아스키코드)값 출력
		
	char ch2 = 66;
	System.out.println(ch2); //정수값에 해당하는 문자 출력
	
	int ch3 = 67;
	System.out.println(ch3); // 문자 정수 값 출력(이부분 잘 모르겠음 결과가 67이 나옴)
	
	System.out.println((char)ch3); //정수 값에 해당하는 문자 출력
	
	}
}