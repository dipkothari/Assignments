package Assignment1;

public class Hostelite extends Student {
	private String hostelName;
	private int roomNumber;
	
	public Hostelite(){
		
	}
	public Hostelite(int id,char Type,String firstname,String lastname,double feePerMonth,String hostelName,int roomNo){
		super(id,Type,firstname,lastname);
		calculatesFees(feePerMonth,300);
		this.hostelName = hostelName;
		roomNumber = roomNo;
		
	}
	public String getHostelName() {
		return hostelName;	
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public static void main(String args[]) {
		Hostelite hostelite = new Hostelite(1231408,'F',"Deep", "Kothari",5000,"NEWHOSTEL",102);
		hostelite.getHostelName();
		hostelite.getRoomNumber();
		System.out.println("Student ID : "+hostelite.getStudentId()+"\n"+
				"Student Type : "+hostelite.getStudentType()+"\n"+
				"Student Name : "+hostelite.getStudentName()+"\n"+
				"Montly Fee : "+hostelite.getFeesPerMonth()+"\n"+
				"Hostel Name : "+hostelite.getHostelName()+"\n"+
				"Room number : "+hostelite.getRoomNumber());
		
	}
}

 
