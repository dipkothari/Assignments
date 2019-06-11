package SelfReview;



class Animal{
	public static void testClassMethod() {
		System.out.println("The class method in Animal");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal");
	}
}

class Cat extends Animal{
	public static void testClassMethod() {//abstract method cannot be static
		System.out.println("The class Method in Cat.");
	}
	public void testInstanceMethod() {
		System.out.println("The Instnace Method in Cat.");
	}
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		Animal.testClassMethod();//static method can also called by class name no need to define object
		myAnimal.testInstanceMethod();
		Cat.testClassMethod();
	}
	
}

