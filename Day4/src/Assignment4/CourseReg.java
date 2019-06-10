package Assignment4;

 class Students {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	Students(int studentId){
		this.studentId = studentId;
	}
	Students (int studentId, char studentType, String studName, int semFees){
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
 class DayScholars extends Students{
	 private String residentialAddress;
	 DayScholars(int studentId, char studentType, String studName,int semFees,String residentialAddress){
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
		 DayScholars dayscholar = new DayScholars(1001,'D',"Eugene",12000,"N0 32/68 Vijaynagar");
		 dayscholar.displayDetails();
	 }
 }
