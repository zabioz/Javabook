package hiding;

public class StudentTest {
	public static void main(String [] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "lee";
		studentLee.setStudentName("leE");
		System.out.println(studentLee.getStudentName());
	}
	
}
