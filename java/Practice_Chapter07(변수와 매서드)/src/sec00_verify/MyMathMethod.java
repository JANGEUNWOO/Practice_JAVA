package sec00_verify;

public class MyMathMethod {

	/*
	Ŭ����(static)�޼��� add      ȣ�� 300
Ŭ����(static)�޼��� subtract ȣ�� 100
Ŭ����(static)�޼��� multiply ȣ�� 20000
Ŭ����(static)�޼��� divide   ȣ�� 2.0
�ν��Ͻ� �޼��� add           ȣ�� 300
�ν��Ͻ� �޼��� subtract      ȣ�� 100
�ν��Ͻ� �޼��� multiply      ȣ�� 20000
�ν��Ͻ� �޼��� divide        ȣ�� 2.0
	   
	*/
      	
	long add() {
		return 300;
	}
	
	long subtract() {
		return 100;
	}
	
	long multiply() {
		return 20000;
	}
	
	long divide() {
		return 2;
	}
	
	static long add(long a, long b) {
		
		return a+b;
	}
	static long subtract(long a, long b) {
		
		return a-b;
	}
	
	static long multiply(long a,long b){
		
		return a*b;
	}
	
	static long divide(long a, long b) {
		return a/b;
	}
		
	
	
	    
}
