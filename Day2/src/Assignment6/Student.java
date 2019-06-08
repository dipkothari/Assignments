package Assignment6;

public class Student {
		
	    String name;
	    Student(String nameval){
	        name= nameval;
	    }
	    Student(){
	        this("student");
	    }
	    public static void main(String args[]){
	        Student deep = new Student("prak");
	        Student deep1 = new Student();
	        System.out.println(deep.name);
	        System.out.println(deep1.name);
	    }
	

}
