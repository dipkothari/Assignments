package Assignment3;

public class Assignment3 {
	 public static void main(String args[]){
	       char grade= 'B';
	       switch(grade){
	           case 'A' :
	           System.out.println("Range of marks 80 - 100");
	           break;
	           case 'B':
	           System.out.println("Range of marks 72 - 79");
	           break;
	           case 'C':
	           System.out.println("Range of marks 65 - 71");
	           break;
	           case 'D':
	           System.out.println("Range of marks 55 - 64");
	           break;
	           case 'E':
	           System.out.println("Range of marks >55");
	           break;
	           default:
	           System.out.println("Grade does not exists");
	           break;
	       }

	    }
}
