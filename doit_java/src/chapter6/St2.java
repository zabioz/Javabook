package chapter6;

public class St2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public St2() {
		serialNum++;
		studentID = serialNum;
		
	}
	
	public String getStudentName() {
		return studentName;
	}

	
	public void setStudentName(String name) {
		studentName = name;
		
		public static int getSerialNum() {
			int i = 10;
			return serialNum;
		}
		
		
		public static void setSerialNum(int serialNum) {
			St2.serialNum = serialNum;
		}
	}
}
