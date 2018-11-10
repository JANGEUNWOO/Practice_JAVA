package sec05_verify;

public class Circle {
	
	private int x;
	private int y;
	private int radius;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	
	public boolean equals(Circle c) {
		if(radius==c.radius) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		Circle cc=(Circle)obj;
		if(radius==cc.radius) {
			return true;
		}
		return false;
	}
	
	
	public String toString() {
		return "원 1: ("+x+","+y+")반지름 "+radius;
	}
}
