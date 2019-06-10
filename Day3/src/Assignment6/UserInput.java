package Assignment6;

public class UserInput {
	public static void main(String[] args) {
		int number, iterations;
		
		number = Integer.parseInt(args[0]);
		iterations = Integer.parseInt(args[1]);
		
			for(int j=1;j<iterations;j++) {
				System.out.println(number+"*"+j+"="+(number*j));
			}
		
	}
}
