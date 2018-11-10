package sec01_eaxm_overloading;

public class StaticOverloadingExample {

	public static void main(String[] args) {

		int result = StaticOverloadingExample.add(3, 5);
		System.out.println(result);

		int[] result2 = new int[] { 0 }; // 배열을 생성하고 result2(0)의 값을 0으로 초기화

		StaticOverloadingExample.add(3, 5, result2); // 배열을 add메서드의 매개변수로 전달
		System.out.println(result2[0]);
	}

	// add() overloading
	static int add(int a, int b) {
		return a + b;

	}

	// 배열명은 곧 주소이다.
	static void add(int a, int b, int[] result) {
		result[0] = a + b; // 매개변수로 넘겨받은 배열에

	}

}
