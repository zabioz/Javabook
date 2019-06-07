package chapter3;

public class OperationEx3 {
	public static void main(String[] args) {
	int num1 = 10;
	int i = 2;
	
	boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); 
	System.out.println(value);
	System.out.println(num1);
	System.out.println(i);
	
	value = ((num1 = num1 + 10) > 10)||((i = i + 2) < 10);// 뒷부분은 앞항의 결과값이 참이므로 실행되지않음
	System.out.println(value);
	System.out.println(num1);
	System.out.println(i);
}
}
