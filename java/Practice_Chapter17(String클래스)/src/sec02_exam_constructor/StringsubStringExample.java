package sec02_exam_constructor;

public class StringsubStringExample {

	public static void main(String[] args) {
		
		//���ڿ� �߶󳻱�
		String ssn="888206-1234567";
		String firstNum=ssn.substring(0,6);  //������ �ε����� ������
		System.out.println(firstNum);
		
		String secondNum=ssn.substring(7);
		System.out.println(secondNum);

	}
}
