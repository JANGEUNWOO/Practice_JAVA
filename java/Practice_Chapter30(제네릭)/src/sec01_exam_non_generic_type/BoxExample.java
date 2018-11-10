package sec01_exam_non_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		//아래 코드를 이해하는 것은 너무나 중요하다.(必)
		Box box=new Box();
		
		box.set("홍길동");  //String타입으로 매개변수로 던졌다.(자동타입 변환)
		
		String name=(String)box.get();  //Object로 가져와 String으로 강제타입 변환
		System.out.println(name);
		
		
		//역시 위와 마찬가지
		box.set(new Apple());
		Apple apple=(Apple)box.get();
		System.out.println(apple);
	}

}
