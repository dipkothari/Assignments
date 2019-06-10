package Assignment8;

public class display {
	public static void main(String args[]) {
		Student student = new Student(1231408,'f',"Deep","kothari");
		//student.setStudentId(Integer.parseInt(args[0]));
		//student.setStudentName(args[1], args[2]);
		student.setResidentialStatus("hostelite");
		student.calculatesFees(10000, 3000);
	//	student.setFeesPerMonth(Integer.parseInt(args[4]));
		System.out.println("StudentID "+" "+student.getStudentId()+"\n"+
							"Student Name"+" "+student.getStudentName()+"\n"
							+"Student Status"+" "+student.getResidentialStatus()+"\n"+
							"Student Fee"+" "+student.getFeesPerMonth());
	}
}
