package sec01_verify;

public class MyColorPoint extends MyPoint {

	String color;
	MyColorPoint(int x, int y, String color ){
		super(x,y);
		this.color=color;
		
	}
	
	protected int move(int x, int y) {
		this.x=x;
		this.y=y;
		return 0;
	}
	protected void reverse() {
		System.out.println("x�� y�� ���� �ٲ���ϴ�.");
	}
	protected void show() {
	    System.out.println("����x,y�� �� : "+this.x+","+this.y+","+this.color);
        	
	}
	
	
}
