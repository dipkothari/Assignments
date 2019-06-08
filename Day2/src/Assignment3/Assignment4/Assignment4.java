package Assignment3.Assignment4;

class Student{
    private int studentId;
    private char studentType;

    public char getstudentType(){
        return studentType;
    }
    public int getstudentId(){
        return studentId;
    }
    public void setstudentId(int id){
        this.studentId=id;
    }
    public void setstudentType(char type){
        this.studentType=type;
    }
}
public class Assignment4 {
	 public static void main(String args[]){
	        Student deep = new Student();
	        deep.setstudentId(1231408);
	        deep.setstudentType('F');
	        System.out.println(deep.getstudentId());
	        System.out.println(deep.getstudentType());

	    }
}
