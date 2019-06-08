package Assignment7;

public class Assignment7 {
public static void main(String[] args){
		
		
		boolean bool2 = true;
		boolean bool1 = false;
		boolean bool3 = true;

		if((bool1=true) || (bool1 && (bool2=false)))
		{
		System.out.println("Success");
		}
		else{
			System.out.println("Faliure");
			}
		System.out.println("bool2 value: " + bool2);
	}
}
