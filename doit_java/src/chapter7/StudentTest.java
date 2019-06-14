package chapter7;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("hangle", 100);
		studentLee.addSubject("math", 56);
		
		Student studentkim = new Student(1002,"kim");
		studentkim.addSubject("hangle", 80);
		studentkim.addSubject("math", 90);
		studentkim.addSubject("eng", 87);
		
		studentLee.showStudentInfo();
		System.out.println("=====================");
		studentkim.showStudentInfo();
	}
}
