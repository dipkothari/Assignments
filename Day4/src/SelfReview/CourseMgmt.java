package SelfReview;

class Parent{
	protected int num;//private can only access within class
	public void setNum(int val) {
		num = val;
	}
	public int getNum() {
		return num;
	}
	public void display() {
		System.out.println("Number :"+num);
	}
}
class Child extends Parent{
	private int val;
	public void setVal(int num) {
		val = num;
	}
	public int getVal() {
		return val;
	}
	public void display() {
		System.out.println("Number :"+num);
		//super.display();//if it is private I can use super to access as it is inherit class
		System.out.println("Value :"+val);
	}
}
public class CourseMgmt {
	public static void main(String args[]) {
		Child child;
		child = new Child();
		child.setNum(100);
		child.setVal(200);
		child.display(); 
	}
}
