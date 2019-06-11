package SelfReview;

public class StaticDemo {
	static int count = 10;
	StaticDemo(){
		//System.out.println();
		count++;
	}
	static void display() {
		System.out.println(count);
	}
	static {
		System.out.println("Static Block written Before Main");
	}
	public static void main(String args[]) {
		//t1.display();
		//Static method(s) are associated to the class in which they reside i.e. they can be called even without creating an instance of the class i.e 
		//StaticDemo.display(); //static is access here with the class name it cannot access by object name
		StaticDemo t1 = new StaticDemo();
		t1.display();
		StaticDemo.display();
		StaticDemo t2 = new StaticDemo();
		StaticDemo.display();
		t2.display();
	}
	static {
		System.out.println("Static Block written After Main");
	}
}
