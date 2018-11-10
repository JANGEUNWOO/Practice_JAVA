package sec04_exam_generic_method_1;

public class BoxingMethodExmaple {

	public static void main(String[] args) {

		// Util클래스의 boxing()메서드는 정적메서드이면서, 아울러 제네릭 메서드이다.
		// 하여 아래와 같이 타입을 지정해줘야 한다. 그럼 정해진 타입에 의헤 T가 결정되어진다.
		// 구체적 타입이 Integer이다. 그러므로 Integer객체가 들어와야 한다.
		// 아울러 리턴타입이 box<Integer>가 되어야한다.
		Box<Integer> box = Util.<Integer>boxing(100);

		// 이렇게 직접 Integer객체를 생성해서 매개변수로 줘도 된다.
		Box<Integer> box1 = Util.<Integer>boxing(new Integer(100));

		// <Integer>는 없어도 된다. 컴파일러가 알아서 매개변수를 보고 타입을 유추한다.
		// 이 방법을 대부분 쓴다. 아울러 박싱이 된다,
		Box<Integer> box2 = Util.boxing(100);
		// Util.<Integer>boxing("홍길동"); //에러난다. 이유?

		int intvalue = box2.get();
		System.out.println("box<Integer> box2 객체에서 받은 값:" + intvalue);

		Box<String> box3 = Util.boxing("홍길동");
		// Box<String> box3=Util.<String> boxing("홍길동");
		String strvalue = box3.get();
		System.out.println("Box<String> box3 객체에서 받은 값:" + strvalue);

	}

}
