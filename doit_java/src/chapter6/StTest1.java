package chapter6;

public class StTest1 {
	public static void main(String[] args) {
		St studentLee = new St();
		studentLee.setStudentName("leeziwon");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		St studentSon = new St();
		studentSon.setStudentName("sonzu");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}

}
