package Assignment1;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private double feesPerMonth;
	
	
	 
	public void calculatesFees(double semesterFees) {
		 feesPerMonth = semesterFees/6.0;
	}
	public void calculatesFees(double semesterFees, double hosterlFees) {
		this.feesPerMonth = semesterFees/6.0;
		this.feesPerMonth = feesPerMonth + hosterlFees;
	}
	public double getFeesPerMonth() {
		
			return feesPerMonth;
		
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
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