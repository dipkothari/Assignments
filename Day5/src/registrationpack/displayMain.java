package registrationpack;

public class displayMain {
	public static void main(String args[]) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Dinil");
		dayScholar.getDetails();
	}
}
