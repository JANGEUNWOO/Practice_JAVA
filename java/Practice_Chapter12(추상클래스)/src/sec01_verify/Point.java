package sec01_verify;

public class Point {

	public static void main(String[] args) {
		
		
		MyColorPoint mp=new MyColorPoint(2,3,"blue");
		mp.show();
		mp.reverse();
		
		mp.move(3, 4);
		mp.show();

	}

}
