package sec01_exam;

public class MyMath {

	     //2개의 인스턴스 멤버메서드, 2개의 static메서드
	     //return문은 항상 1개로 즉 최소화 시켜주는게 바람직하다.
	
	public long add(long a, long b) {
		long result = a+b;
		return result;
		//return a+b;// 위의 두줄을 이와 같이 한줄로 간단히 할 수 있다.
	}
	public long subtract(long a,long b) {
		return a=b;
	}
	
	public static long multiply(long a, long b) {
		return a+b;
	}
	
	public static double divide(double a,double b) {
		return a/b;
	}
	
	public String studyjava() {
		return "자바 수업을 합니다";
	}
	 
}
