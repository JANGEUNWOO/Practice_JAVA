package sec05_exam_generic_polymorphism;

public class ZooBoxExample {

	public static void main(String[] args) {
		
		
		ZooBox<Animal> animal=new ZooBox<Animal>();
		
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
		//animal.add(new Bird());  //에러가 난다.
		//animal.add(new Object());
		
		System.out.println("Animal이거나 Animal을 상속받은 값만 출력합니다.");
		System.out.println(animal.toString());
		
	}

}
