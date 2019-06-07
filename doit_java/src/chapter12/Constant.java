package chapter12;

public class Constant {
	public static void main(String[] args) {
		final int MAX_NUM = 100; //선언과 동시에 초기화
		final int MIN_NUM;
		
		MIN_NUM = 0; // 사용전에 초기화 하지 않으면 오류가 남(동시 초기화와 나눠서 초기화 하는 차이에 대해)
		
	System.out.println(MAX_NUM);
	System.out.println(MIN_NUM);
	}

}
