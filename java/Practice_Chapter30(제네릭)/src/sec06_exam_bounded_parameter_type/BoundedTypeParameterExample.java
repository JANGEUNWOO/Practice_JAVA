package sec06_exam_bounded_parameter_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {

		// int result = Util.compare("홍길동", "강동길"); //에러난다 이유는?
		// int result2 = Util.<Integer>compare(100.1, 200); //에러
		// int result3 = Util.compare(new Object(), new Object()); // 에러
		// int result4 = Util.compare(new Number(), new Number());

		// 직접 객체를 생성해서 넘기는 형태지만 그냥 숫자값 넣으면 자동 박싱이 된다.
		int result1 = Util.compare(100, 200);
		System.out.println(result1);

		result1 = Util.compare(100.1, 200);
		System.out.println(result1);

		result1 = Util.compare(new Integer(100), new Integer(200));
		System.out.println(result1);

		result1 = Util.compare(new Double(400.77), new Integer(200));
		System.out.println(result1);

		result1 = Util.compare(4.5, 1);
		System.out.println(result1);

		result1 = Util.compare(4.5, 4.5);
		System.out.println(result1);
	}

}
