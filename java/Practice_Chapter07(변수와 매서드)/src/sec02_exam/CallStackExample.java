package sec02_exam;

public class CallStackExample {

	public static void main(String[] args) {
		
		
		
		System.out.println("main()");
		//static�� static�� �θ� �� �ִ�.
		CallStackExample.firstMethod();
		System.out.println("main()�� �����ϴ�.");
		
	}
	
	static void firstMethod() {
		System.out.println("firstMehod()");
		//static�� static�� �θ��� �ִ�.
		CallStackExample.secondMethod();
		System.out.println("main()���� ���ư��ϴ�.");
	}

	static void secondMethod() {
		System.out.println("secondMehod()");
		System.out.println("firstMehod()�� ���ư��ϴ�.");
	}
}
    

