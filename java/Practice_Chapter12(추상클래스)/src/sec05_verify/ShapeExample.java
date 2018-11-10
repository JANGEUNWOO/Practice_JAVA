package sec05_verify;

public class ShapeExample {
	
	static int i;
	static double sumArea(Shape[] arr) {
		return 0;
	}
	
	public static void main(String[] args) {
	
		Shape[] arr = {new Circle(5.0), new Rect(3,4), new Circle(1)}; 
		
		arr[0].calcArea();
		arr[1].calcArea();
		arr[2].calcArea();

	}

}
