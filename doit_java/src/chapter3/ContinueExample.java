package chapter3;

public class ContinueExample {
	public static void main (String[] args) {
		int total = 0;
		int num;
		
		for (num = 1; num <= 100; num ++) {
			if(num % 2 ==0)
				continue;  //100까지 반복 넘 값이 짝수인경우 이후수행을 생략하고 넘 ++을 수행 넘 값이 홀수인 경우에만 수행
			total += num;
		}
		System.out.println("1~100까지의 홀수의 합은 " + total );
	}

}
