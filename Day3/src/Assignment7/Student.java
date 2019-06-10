package Assignment7;

public class Student {
	private int studentId;
	//private char studentType;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;
	//private  long hostelFee = 250;
	
	 public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public long getFeesPerMonth() {
		
			return feesPerMonth;
		
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	Student(){
		studentId =10;
		//studentType = 'F';
	}
	public Student(int id,char type,String firstName,String lastName){
		studentId =id;
		//studentType = type;
		studentName = firstName+" "+lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	//public char getStudentType() {
	//	return studentType;
	//}
	//public void setStudentType(char studentType) {
	//	this.studentType = studentType;
	//}
	public void setStudentName(String firstName, String lastName) {
		studentName = firstName+" "+lastName;
	}
	public String getStudentName() {
		return studentName;
	}
	
}
