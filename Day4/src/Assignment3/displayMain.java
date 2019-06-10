package Assignment3;

public class displayMain {

	public static void main(String[] args) {
		 String str = args[0];
		System.out.println(str);
		System.out.println(str.toLowerCase());

		if(str.equalsIgnoreCase("hostelite"))
		{
			Student s = new Hostelite(1231408,'F',"Deep Kothari",5000,"NEWHOSTEL",102);
			s.displayStudentDetails();
		}
		else 
		{
			Student s = new DayScholar(1231408,'F',"Deep Kothari",2000,"IMCS Irvine");
			s.displayStudentDetails();
		}

}
}
