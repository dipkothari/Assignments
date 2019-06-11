
public interface InterOne {
	int varOne=0;
	int varTwo = 100;
	void methodOne();
	void methodTwo();
}

class Example implements InterOne{
	public void methodOne() {
		//varTwo=varTwo+10;
		System.out.println("Value of varTwo :"+varTwo);
		System.out.println("Good Morning");
	}
	public void methodTwo() {
		System.out.println("Good Afternoon");
	}
}
