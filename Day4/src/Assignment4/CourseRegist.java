package Assignment4;

class CourseRegistration{
	static protected int regId;
	protected String courseName;
	CourseRegistration(){
		regId++;
	}
	CourseRegistration(String cName){
		this();
		courseName = cName;	
	}
	public void displayDetails() {
		System.out.println("Registration ID :"+regId);
		System.out.println("CourseName :"+courseName);
	}
	
}

  class Student extends CourseRegistration{
		protected int studentId;
		protected char studentType;
		protected String studentName;
		protected int semesterFees;
		private int feesPerMonth;
		Student(int studentId, String cName){
			super(cName);
			this.studentId = studentId;
		}
		Student(int studentId, char studentType,String studName, int semFees, String cName){
			this(studentId,cName);
			this.studentType=studentType;
			studentName=studName;
			semesterFees=semFees;
		}
}
 class DayScholar extends Student{
	private String residentialAddress;
	DayScholar(int studentId, char studentType, String studName,int semFees, String residentialAddress, String cName){
		super(studentId,studentType,studName,semFees,cName);
		this.residentialAddress = residentialAddress;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println(studentId+"\n"+
				semesterFees+"\n"+
				studentName+"\n"+
				studentType+"\n"+
				residentialAddress+
				courseName);
	}
}
class CourseRegist{
	public static void main(String args[]) {
		DayScholar dayscholar = new DayScholar(1001,'D',"Eugene",12000,"No32/68 Vijayanager","oop");
		dayscholar.displayDetails();
		DayScholar dayscholar1 = new DayScholar(1001,'D',"Eugene",12000,"No32/68 Vijayanager","oop");
		
		dayscholar1.displayDetails();
	}
}























