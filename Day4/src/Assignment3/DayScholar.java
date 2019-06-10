package Assignment3;

public class DayScholar extends Student {
	private String residentialAddress;
	
	DayScholar(){
		
	}
	DayScholar(int id,char type, String name, double fees, String address){
		studentId = id;
		studentType = type;
		studentName = name;
		this.feesPerMonth = fees;
		residentialAddress= address;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Residential Address : "+getResidentialAddress());
	}
}