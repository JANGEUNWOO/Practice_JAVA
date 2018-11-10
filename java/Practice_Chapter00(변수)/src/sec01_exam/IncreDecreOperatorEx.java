package sec01_exam;

public class IncreDecreOperatorEx {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		
		System.out.println("--------------");
		System.out.println("x="+x++);
		x++;//후위증가
		++x;//전위증가
		System.out.println("x="+x++);
	    System.out.println("x="+x);
		
		System.out.println("--------------");
		y--;//후위감소
		--y;//전위감소
		System.out.println("y="+y);
		
/*		
        System.out.println("--------------");
	    z=x++;
	    System.out.println("z="+z);
	    System.out.println("x="+x);
	
	    System.out.println("--------------");
	    z=(x++)+(y++);
	    System.out.println("z="+z);
        System.out.println("x="+x);
	    System.out.println("y="+y);
*/
	}

}
