package sec02_exam_constructor;

public class StringToLowerUpperExample {

	public static void main(String[] args) {
		String str1="Java Programming";
		String str2="JAva Programming";
		
		System.out.println(str1.equalsIgnoreCase(str2));  //대소문자 상관없이 비교함.
		//자바는 대소문자를 구분한다.
		System.out.println(str1.equals(str2));
		String lowerStr1=str1.toLowerCase();
		String lowerStr2=str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
	}
}
