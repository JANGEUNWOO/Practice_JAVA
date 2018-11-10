package sec01_exam;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1="신민철";
		String strVar2="신민철";
		//새로운 객체 생성(주소가 달라짐)
		String strVar3=new String("신민철");
		
		//주소값 비교(자바에서는 String의 리터럴이 같을 경우, 값은 번지 참조함)
		System.out.println(strVar1==strVar2);
		System.out.println(strVar1==strVar3); //주소값 비교
		System.out.println();
		
		//값을 가지고 비교(equals)는 비교 대상과 값이 같은지를 비교함
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); //값을 가지고 비교
	
		
	}

}
