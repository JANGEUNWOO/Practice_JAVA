package sec02_exam_constructor;

public class StringsubStringExample {

	public static void main(String[] args) {
		
		//문자열 잘라내기
		String ssn="888206-1234567";
		String firstNum=ssn.substring(0,6);  //마지막 인덱스는 미포함
		System.out.println(firstNum);
		
		String secondNum=ssn.substring(7);
		System.out.println(secondNum);

	}
}
