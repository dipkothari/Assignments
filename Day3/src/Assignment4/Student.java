package Assignment4;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	
	 Student(){
		studentId =10;
		studentType = 'F';
	}
	public Student(int id,char type,String firstName,String lastName){
		studentId =id;
		studentType = type;
		studentName = firstName+" "+lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String firstName, String lastName) {
		studentName = firstName+" "+lastName;
	}
	public String getStudentName() {
		return studentName;
	}
	
}