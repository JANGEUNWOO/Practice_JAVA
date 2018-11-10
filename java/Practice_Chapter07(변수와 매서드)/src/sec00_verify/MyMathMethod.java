package sec00_verify;

public class MyMathMethod {

	/*
	클래스(static)메서드 add      호출 300
클래스(static)메서드 subtract 호출 100
클래스(static)메서드 multiply 호출 20000
클래스(static)메서드 divide   호출 2.0
인스턴스 메서드 add           호출 300
인스턴스 메서드 subtract      호출 100
인스턴스 메서드 multiply      호출 20000
인스턴스 메서드 divide        호출 2.0
	   
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
