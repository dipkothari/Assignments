package Assignment4;

 class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	Student(int studentId){
		this.studentId = studentId;
	}
	Student (int studentId, char studentType, String studName, int semFees){
		this(studentId);
		this.studentType=studentType;
		studentName = studName;
		semesterFees = semFees;
	}
	void displayDetails() {
		System.out.println(studentId+"\n"+
							semesterFees+"\n"+
							studentName+"\n"+
							studentType);
	}

}
 class DayScholar extends Student{
	 private String residentialAddress;
	 DayScholar(int studentId, char studentType, String studName,int semFees,String residentialAddress){
		 super(studentId, studentType,  studName,  semFees);
		 this.residentialAddress=residentialAddress;
	 }
	 void displayDetails() {
			super.displayDetails();
			System.out.println(residentialAddress);
		}
 }
 class CourseReg{
	 public static void main(String args[]) {
		 DayScholar dayscholar = new DayScholar(1001,'D',"Eugene",12000,"N0 32/68 Vijaynagar");
		 dayscholar.displayDetails();
	 }
 }
