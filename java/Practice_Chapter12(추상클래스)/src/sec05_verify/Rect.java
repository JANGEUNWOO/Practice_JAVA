package sec05_verify;

public class Rect extends Shape {
	
	
	double width;
	double height;
	
	public Rect(double width, double height){
		super();
		this.width=width;
		this.height=height;
	}
	
	public Rect(Point p, double width, double height){
		super();
		this.width=width;
		this.height=height;
	}
	
	public boolean isSquare() {
		if(this.height!=0 && this.width!=0) {
			return true;
		}else {
		return false;	
		}
	}

	public double calcArea() {
		double x=width*height;
		System.out.println("Rect면적의합:"+x);
		return x;
	}

}
