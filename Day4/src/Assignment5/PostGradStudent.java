package Assignment5;

public class PostGradStudent extends Student  {
	protected int postCourseId;
	protected String postCourseName;
	protected int postCoursefees;
	
   public PostGradStudent(int pCourseId, String pCourseName, int pCourseFees, int sid, char sType, String sName) {
		super(sid,sType,sName);
		postCourseId = pCourseId;
		postCourseName = pCourseName;
		postCoursefees = pCourseFees;
	}
   public int getpostCourseId() {
	   return postCourseId;
   }
   public String getpostCourseName() {
	   return postCourseName;
   }
   public void displayDetails() {
		super.displayDetails();
			System.out.println("Post Course ID :"+postCourseId+"\n"+
								"Post Course Name :"+postCourseName
								);
		
	}
}
