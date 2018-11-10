package sec02_exam_exception;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(2);
        try {
        	System.out.println(3);
        	System.out.println(4);
        	
        }
        catch(Exception e) {
        	System.out.println(5);  //5는 출력이 되질 않는다. 그 이유는?
        }
        System.out.println(6);
	}

}
