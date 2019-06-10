package Assignment7;

public class display {
	public static void main(String args[]) {
		Student student = new Student();
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentName(args[1], args[2]);
		student.setResidentialStatus(args[3]);
		student.setFeesPerMonth(Integer.parseInt(args[4]));
		System.out.println("StudentID "+" "+student.getStudentId()+"\n"+
							"Student Name"+" "+student.getStudentName()+"\n"
							+"Student Status"+" "+student.getResidentialStatus()+"\n"+
							"Student Fee"+" "+student.getFeesPerMonth());
	}
}
