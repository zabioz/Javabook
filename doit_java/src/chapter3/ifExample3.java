package chapter3;

public class ifExample3 {

	public static void main (String [] args) {
		int score = 79;
		char grade;
	
	if (score >= 90) {
		grade = 'A';
		System.out.println("A");
	}
		else if (score >= 80) {
			grade = 'B';
			System.out.println("B");
		}
		else if (score >= 70) {
			grade = 'C';
			System.out.println("C");
		}
	
		else if (score >= 60) {
			grade = 'D';
			System.out.println("D");
	}
		else {
				grade = 'F';
				System.out.println("F");
	}
	System.out.println("score is " + score + " grade is " + grade);
	}
}


