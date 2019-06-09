package Assignment9;

public class Student {
	private static int studentId=550;
	private char studentType;
	private String studentName;
	Student() {
		//this.studentId=550;
		studentId++;
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
