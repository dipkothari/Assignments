package Selfreview;
interface Count{
	short counter=0;
	void countUp();
}
public class TestCount implements Count {
	public static void main(String[] args) {
		TestCount test=new TestCount();
		test.countUp();
	}
	public void countUp() {
		for(int x=6;x>counter;x--) {//counter is final in interface so cannot be incremented
			System.out.println("  "+counter);
		}
	}
}
