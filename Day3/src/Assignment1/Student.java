package Assignment1;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private static int studentCount;
	static {
		studentCount=10;
	}
	Student() {
		//this.studentId=550;
		studentId=studentCount++;
	}
	Student(char sType, String fname, String lname){
		this();
		studentType = sType;
		studentName=fname + lname;
	}
	public void displayDetails(Student obj) {
		System.out.println("studentID :"+studentId);
		System.out.println("studentType :"+obj.studentType);
		System.out.println("studentName :"+obj.studentName);
		
	}
}

