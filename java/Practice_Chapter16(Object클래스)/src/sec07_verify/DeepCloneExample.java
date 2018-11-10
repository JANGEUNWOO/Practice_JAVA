package sec07_verify;

public class DeepCloneExample {

	public static void main(String[] args) {
		
		
		Rectangle rt=new Rectangle(10,10,-5,-5);
		
		rt.showPosition();
		rt.changePos(2, 2, 7, 7);
		rt.showPosition();
		

	}

}
