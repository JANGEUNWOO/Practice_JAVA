package sec01_exam_runtime_exception;

public class NullPointerException {

	public static void main(String[] args) {
		
		
		String data=null;
		
		//String data=new String("자바")
		//NullPointException발생(런타임 예외)함 그 이유는? data에 값이 없는데 출력하라고 해서..
		System.out.println(data.toString());
	}
	
	
}
