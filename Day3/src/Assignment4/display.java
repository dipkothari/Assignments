package Assignment4;

public class display {

	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student(110,'E',"deep","Kothari");
		student.setStudentId(100);
		student.setStudentType('F');
		student.setStudentName("deep","kothari");
		System.out.println("ID:"+student.getStudentId()+"\n"+"Type :"+student.getStudentType()+"\n"+"studentName "+student.getStudentName());
		System.out.println("ID:"+student1.getStudentId()+"\n"+"Type :"+student1.getStudentType()+"\n"+"studentName "+student1.getStudentName());
	}

}
