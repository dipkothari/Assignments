package caseStudy;

import java.util.*;

public class GenerateTicket {
	static int count;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean stop = false;
		while(!stop) {
		String a = in.nextLine();	
		if(a.equalsIgnoreCase("F")) {
			
			System.out.println("115"+a+Random(101,105)+String.format("%04d", count));
			count++;
		}
		else if(a.equalsIgnoreCase("T")) {
			
			System.out.println("115"+a+Random(201,205)+String.format("%04d", count));
			count++;
		}
		else if(a.equalsIgnoreCase("B")) {
			
			System.out.println("115"+a+Random(301,305)+String.format("%04d", count));
			count++;
		}
	}
   	
	    //do whatever
	    System.out.println("Would you like to continue? (yes or no)");
	    String s = in.nextLine();
	    if(s.equals("no")) {
	        stop = true;
	    }
	}
	private static int d4(int count2) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static int Random(int i, int j) {
		int x = (int)(Math.random()*((i-j)+1))+j;
	    return x;
	} 

}
