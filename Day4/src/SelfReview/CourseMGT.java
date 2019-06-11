package SelfReview;


	class Parentt{
		private int num;//private can only access within class
		Parentt(int num) {
			this.num = num;
		}
		public int getNum() {
			return num;
		}
		//public void display() {
		//	System.out.println("Number :"+num);
		//}
	}
	class Childd extends Parentt{
		private int val;
		Childd(int num,int val) {
			super(num);
			this.val=val;
		}
		public int getVal() {
			return val;
		}
	//	public void display() {
			//System.out.println("Number :"+num);
	//		super.display();//if it is private I can use super to access as it is inherit class
		//	System.out.println("Value :"+val);
		}
	
	public class CourseMGT {
		public static void main(String args[]) {
			Childd child;
			child = new Childd(100,200);
			System.out.println("Number :"+child.getNum());
			
					System.out.println("Value :"+child.getVal()); 
		}
	
}
