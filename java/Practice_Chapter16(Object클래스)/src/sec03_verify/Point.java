package sec03_verify;

public class Point {

	private int x;
	private int y;
	public Point() {}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
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

    
	public boolean equals(Point p) {
		
		if(x==p.x&&y==p.y) {
			return true;
		}else {
		return false;
	  }
	}
	
	@Override
	public boolean equals(Object obj) {
		Point pp=(Point)obj;
		if(x==pp.x&&y==pp.y) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "x : "+x+"�̸�, y : "+y+"�̴�";
	}
	
}
