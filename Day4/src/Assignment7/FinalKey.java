package Assignment7;


class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees =12000;
	protected double feesPerMonth;
	
	Student(){
		
	}
	void calculateFee() {
		feesPerMonth=semesterFees/6.0;
	}
	
	public void setStudentType(char sType) {
		this.studentType=sType;
	}
	public void setStudentName(String sName) {
		this.studentName=sName;
	}
	public void getDetails() {
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Type : "+studentType);
		calculateFee();
		System.out.println("Student Fee per Month : "+feesPerMonth);
		
	}
	public void setStudentId(int i) {
		// TODO Auto-generated method stub
		this.studentId=i;
		
	}
	
	
}
class DayScholar extends Student{
	private String residentialAddress;
	
	 DayScholar() {
		
	}
	 DayScholar(int studentId,char studentType, String studentName,double feePerMonth,String residentialAddress){
		 this.studentId=studentId;
		 this.studentType=studentType;
		 this.studentName=studentName;
		 this.feesPerMonth=feePerMonth;
		 calculateFee();
		 this.residentialAddress=residentialAddress;
		 
	 }
	
	public final void setResAddress(String resAddress) {
		this.residentialAddress=resAddress;
	}
	public final void getDetails() {
		super.getDetails();
		System.out.println("Student Name : "+studentName);
		System.out.println("Residential Address : "+residentialAddress);
	}
}
public class FinalKey {
	public static void main(String args[]) {
		DayScholar dayScholar = new DayScholar(1001,'D',"Thomas",12000,"IMCSGROUP");
	//	dayScholar.setStudentId(1001);
	//	dayScholar.setStudentType('D');
	//	dayScholar.setStudentName("Thomas");
	//	dayScholar.setResAddress("IMCS group");
	//	dayScholar.getDetails();
		dayScholar.getDetails();
		DayScholar dayScholar1 = new DayScholar(101,'D',"Thomas",12000,"IMCOUP");
		dayScholar1.getDetails();
	}
}

