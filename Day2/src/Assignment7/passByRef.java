package Assignment7;



public class passByRef {
	 public static void main(String args[]) {
	        int sID = 25;
	        passByRef ref = new passByRef();
	        System.out.println("1:" + sID);
	        Assignment5.Student deep = new Assignment5.Student();
	        ref.passTheValueMethod(deep);
	        System.out.println("The sID are 2:" + sID);
	    
	    }
	    public void passTheValueMethod(Assignment5.Student d){
	    // sID = 10;
	    	d.setGetStudentId(22);
	        System.out.println("The sID are 4:" +d.getGetStudentId());
	    }
}
