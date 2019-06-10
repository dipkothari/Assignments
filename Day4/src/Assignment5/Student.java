package Assignment5;

public class Student {
	protected static int studentId;
	protected char studentType ;
	protected String studentName;
	
	
	public Student(){
		//this.studentId = studentId;
		this.studentId++;
	}
	public Student(int studentId,char studentType, String studentName){
			//this();
	//	this.studentId = studentId;
			this();
			this.studentId=this.studentId+studentId;
			this.studentType= studentType;
			this.studentName = studentName;
	}
	public void displayDetails() {
		System.out.println("Student ID :"+studentId+"\n"+
							"Student Type:"+studentType+"\n"+
							"Student Name"+studentName);
	}
}
