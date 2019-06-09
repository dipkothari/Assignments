package Assignment5;
import java.util.Scanner;

public class strings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hi"+" "+s);
		String us = s.next();
		if(us.charAt(0)=='a'||us.charAt(0)=='A') {
			System.out.println("yes it does start with a");
		}
		else{
				System.out.println("NO sorry it does not start with a");
		}
		System.out.println(us.toLowerCase());
		System.out.println(us.toUpperCase());
		System.out.println(us.replaceAll(us, "Krishna"));	
		
		
	}

}
