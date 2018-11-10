package sec07_verify;

public class Rectangle {

	Point upperLeft;
	Point lowerRight;
	
	public Rectangle(int a,int b,int c,int d) {
		this.upperLeft=new Point(a,b);
		this.lowerRight=new Point(c,d);
	}
	
	public void showPosition() {
		System.out.println("[���簢�� ��ġ ����]");
		System.out.println("�� ���:");
		upperLeft.showPosition();
		System.out.print("�� �ϴ�:");
		lowerRight.showPosition();
		System.out.println("");
	}
	
	public void changePos(int a,int b,int c, int d) {
		this.upperLeft.changePos(a, b);
		this.lowerRight.changePos(c, d);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Rectangle copy=(Rectangle)super.clone();
		copy.upperLeft=(Point)upperLeft.clone();
		copy.lowerRight=(Point)lowerRight.clone();
		return copy;
	}
	
	
	
	
}
