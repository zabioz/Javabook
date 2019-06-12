package chapter6;

public class StTest2 {

	public static void main(String[] args) {
		St1 studentLee =  new St1();
		studentLee.setStudentName("leeziwon");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + "학번:" + studentLee.studentID);
		
		St1 studentSon = new St1();
		studentSon.setStudentName("sonzu");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + "학번:" + studentSon.studentID);
		
	}
}
