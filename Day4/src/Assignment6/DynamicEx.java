package Assignment6;
class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	public void setStudentType(char sType) {
		this.studentType=sType;
	}
	public void setStudentName(String sName) {
		this.studentName=sName;
	}
	public void getDetails() {
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Type : "+studentType);
		
	}
	public void setStudentId(int i) {
		// TODO Auto-generated method stub
		this.studentId=i;
		
	}
	
}
class DayScholar extends Student{
	private String residentialAddress;
	public void setResAddress(String resAddress) {
		this.residentialAddress=resAddress;
	}
	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name : "+studentName);
		System.out.println("Residential Address : "+residentialAddress);
	}
}
public class DynamicEx {
	public static void main(String args[]) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		dayScholar.setResAddress("IMCS group");
		dayScholar.getDetails();
	}
}
