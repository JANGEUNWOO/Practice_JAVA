package sec06_verify;

public class MathRoundExample {

	public static void main(String[] args) {
		System.out.println("자바에서 제공하는 Math.round(3.17836)를 한 결과 : "+ Math.round(3.17836));
		System.out.println();
		System.out.println("직접 만든 round()를 사용한 결과");
		System.out.println("Math.round()와 Math.pow()를 조합하여 만듭니다.");
		System.out.println();
		System.out.println("3.17836를 둘째 자리에서 반올림 한 결과 : "+round(3.17836,2));
		System.out.println("3.17836를 세째 자리에서 반올림 한 결과 : "+round(3.17836,3));
		System.out.println("3.17836를 네째 자리에서 반올림 한 결과 : "+round(3.17836,4));
		System.out.println("3.17836를 다섯째 자리에서 반올림 한 결과 : "+round(3.17836,5));
		
	}
	public static double round(double d, int n) {
		return Math.round(3.17836*Math.pow(10,n-1))/Math.pow(10,n-1);

	}

}
