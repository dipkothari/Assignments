package Assignment5;

public class DayScholar extends PostGradStudent {
	private String residentialAddress;
	public DayScholar(int pCourseId,String pCourseName,int pCourseFees,int sid,char sType, String sName, String rAddress) {
		super(pCourseId,pCourseName,pCourseFees,sid,sType,sName);
		this.residentialAddress = rAddress;
	}
	public void calculateFees() {
		this.postCoursefees = postCoursefees / 6;
	}
	public int getFees() {
		calculateFees();
		return postCoursefees;
	}
	public void displayDetails() {
		super.displayDetails();
			System.out.println("Fees"+getFees()+"\n"+
								"Residential Address "+residentialAddress
								);
		
	}
}
