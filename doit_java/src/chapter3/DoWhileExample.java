package chapter3;

public class DoWhileExample {
		public static void main(String [] args) {
			int num = 1;
			int sum = 0;
			
			do {
				sum += num; //조건식이 참이 아니더라도 무조건 한번 수행함
				num ++;
			} 
			while(num <= 10);
			
			System.out.println("1~10 sum is" + sum );
		}

	}

