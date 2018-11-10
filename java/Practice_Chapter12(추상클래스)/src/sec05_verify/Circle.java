package sec05_verify;

public class Circle extends Shape{

	double r;
	
	public Circle (double r) {
		super();
		this.r=r;
	}
	
	public Circle(Point p, double r){
		super.p=p;
		this.r=r;
	}
	
	public double calcArea() {
		double x=r*r*Math.PI;
		System.out.println("Circle면적의 합 : "+x);
		return x;
	}
	
	
	
	
}
