package Selfreview;
abstract class Animal{
	abstract void testClassMethod();//abstract has no static Method
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal");
	}
}

class Cat extends Animal{
	public void testClassMethod() {//abstract method cannot be static
		System.out.println("The class Method in Cat.");
	}
	public void testInstanceMethod() {
		System.out.println("The Instnace Method in Cat.");
	}
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		myAnimal.testClassMethod();//cannot call using Abstract class name
		myAnimal.testInstanceMethod();
	}
	
}
