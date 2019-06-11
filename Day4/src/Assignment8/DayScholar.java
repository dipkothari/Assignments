package Assignment8;


public class DayScholar extends Student {
	private String residentialAddress;
	
	DayScholar(){
		
	}
	public DayScholar(int id,char type, String name, double fees, String address){
		studentId = id;
		studentType = type;
		studentName = name;
		calculateFees(fees);
		residentialAddress= address;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Residential Address : "+getResidentialAddress());
	}
	public void calculateFees(double semesterFees) {
		this.feesPerMonth = semesterFees/6.0;
	}
}
