package chapter4;

public class StudentTest {

	public static void main (String [] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "ahn";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}
