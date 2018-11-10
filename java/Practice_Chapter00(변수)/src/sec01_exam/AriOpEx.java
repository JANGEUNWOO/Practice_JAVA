package sec01_exam;

public class AriOpEx {

	public static void main(String[] args) {
		
		int v1=5;
		int v2=2;
		
		int result1=v1+v2;
		System.out.print("result1="+result1);
		int result2=v1-v2;
		System.out.print("result2="+result2);
		int result3=v1*v2;
		System.out.print("result3="+result3);
		int result4=v1/v2;
		System.out.print("result4="+result4);
		int result5=v1%v2;
		System.out.print("result5="+result5);
		
		double result6=v1/0;
		System.out.print("--"+result6);
		//system.out.print("예외발생 "+e.getmeassage()); runtimeexception 과 Arithmeticexception이 존재함.
		
		
	}

}
