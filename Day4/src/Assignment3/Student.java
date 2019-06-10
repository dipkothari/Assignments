package Assignment3;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	protected String residentialAddress;
	
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
	public double getFeesPerMonth() {		
		return feesPerMonth;	
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void displayStudentDetails() {
		System.out.println("Student ID : "+getStudentId()+"\n"+
					"Student Type : "+getStudentType()+"\n"+
					"Student Name : "+getStudentName()+"\n"+
					"Montly Fee : "+getFeesPerMonth());
	}
}
