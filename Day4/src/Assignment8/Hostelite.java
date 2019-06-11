package Assignment8;


public class Hostelite extends Student {
	private String hostelName;
	private int roomNumber;
	
	public Hostelite(){
		
	}
	public Hostelite(int id,char Type,String name,double feePerMonth,String hostelName,int roomNo){
		studentId = id;
		studentType = Type;
		studentName = name;
		calculateFees(feePerMonth);
		this.hostelName = hostelName;
		roomNumber = roomNo;
		
	}
	public String getHostelName() {
		return hostelName;	
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees/6.0;
		feesPerMonth=feesPerMonth + 1200;
	}
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Hostel Name : "+getHostelName()+"\n"+
				"Room number : "+getRoomNumber());
	}
}
