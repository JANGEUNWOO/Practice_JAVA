package sec01_verify;

public class BoxingExample {

	public static void main(String[] args) {
		
		//i를 자동 박싱한  intObject의 값 :  10
		//intObject를 i로 자동언박싱한 값 : 20

		
		Integer intobj=new Integer(10);
		System.out.println("i를 자동 박싱한  intObject의 값 : "+intobj);
		
		Integer i=intobj.intValue()+10;
		System.out.println("intObject를 i로 자동언박싱한 값 :"+i);
			
	}
}
