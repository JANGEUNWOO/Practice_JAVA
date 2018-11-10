package sec01_verify;

public class CastingExample {

	public static void main(String[] args) {
		
		int intValue=44032;
		char charValue=(char)intValue;
		System.out.println("intValue값을 charValue로 강제캐스팅 결과값 : "+charValue);
		
		long longValue=500l;
		intValue=(int)longValue;
		System.out.println("longValue값을 intValue로 강제캐스팅 결과값 : "+intValue);
		
		
		double doubleValue=3.0;
		intValue=(int)doubleValue;
		System.out.println("doubleValue값을 intValue로 강제캐스팅 결과값 : "+intValue);
		
		
		
	}

}
