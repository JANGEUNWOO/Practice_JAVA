package sec07_verify;

public class Point implements Cloneable {

	int xPos;
	int yPos;
	
	
	public Point(int xPos,int yPos) {
		this.xPos=xPos;
		this.yPos=yPos;
	}
    
	public void showPosition() {
		
	}
	
	public void changePos(int x, int y) {
		this.xPos=x;
		this.yPos=y;
	}
	
	
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
