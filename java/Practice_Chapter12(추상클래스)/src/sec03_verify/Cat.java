package sec03_verify;

public class Cat extends Animal {

	
	Cat(String kind){
		super(kind);
	}
	
	void sound() {
		System.out.println(kind+"인 고양이가 소리를 냅니다. 야옹~~");
	}
	
	
}
