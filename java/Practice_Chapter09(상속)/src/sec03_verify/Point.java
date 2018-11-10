package sec03_verify;

public class Point {

	int x;
	int y;
	
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	
	void showPoint() {
		System.out.print("(x:"+x+",y:"+y+")");
	}
	
	Point(){
		
	}
}
