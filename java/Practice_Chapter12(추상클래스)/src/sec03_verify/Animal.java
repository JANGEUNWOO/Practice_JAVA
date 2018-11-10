package sec03_verify;

public abstract class Animal {

	String kind;
	Animal(String kind){
		this.kind=kind;
	}
	
	void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
	abstract void sound();
	
}
