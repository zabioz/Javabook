package chapter6;

public class StTest3 {

	public static void main(String[] args) {
		St1 studentLee = new St1();
		studentLee.setStudentName("leeziwon");
		System.out.println(St1.serialNum);
		System.out.println(studentLee.studentName + "학번:" + studentLee.studentID);
		
		St1 studentSon = new St1 ();
		studentSon.setStudentName("sonzu");
		System.out.println(St1.serialNum);
		System.out.println(studentSon.studentName + "학번:" + studentSon.studentID);
	}	
}

