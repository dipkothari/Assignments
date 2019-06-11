package SelfReview;

public class thisSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
		square.display(5);
		int area = square.calculateArea();
		
		System.out.println("The are of the square is : "+area);
	}

}

 class Square{
	int length;
	void display(int length) {
		this.length=length;
	}
	int calculateArea() {
		return(length*length);
	}
}
