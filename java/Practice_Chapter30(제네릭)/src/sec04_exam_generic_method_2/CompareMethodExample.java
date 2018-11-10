package sec04_exam_generic_method_2;

public class CompareMethodExample {

	public static void main(String[] args) {
		// P1의 K타입이 Integer, V타입이 String임을 기억하자.
		// (K와 V는 사용자가 원하는대로 정할 수 있음)
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p3 = new Pair<Integer, String>(4, "사과");

		// boolean result1=Util.<Integer,String>compare(p1,p2); //jdk 1.6까지
		boolean result = Util.compare(p1, p2); // jdk 1.7부터

		if (result)
			System.out.println("논리적 동등한 객체");
		else
			System.out.println("논리적 동등하지 않은 객체");

		result = Util.compare(p1, p3); // 1.7부터

		if (result)
			System.out.println("논리적 동등한 객체");
		else
			System.out.println("논리적 동등하지 않은 객체");

		Pair<String, String> p4 = new Pair<String, String>("사용자1", "낭궁섬");
		Pair<String, String> p5 = new Pair<String, String>("사용자2", "낭궁섬");

		result = Util.compare(p4, p5);
		if (result)
			System.out.println("논리적 동등한 객체");
		else
			System.out.println("논리적 동등하지 않은 객체");

	}

}
