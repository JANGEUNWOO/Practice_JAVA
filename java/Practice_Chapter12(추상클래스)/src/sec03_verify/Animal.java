package sec03_verify;

public abstract class Animal {

	String kind;
	Animal(String kind){
		this.kind=kind;
	}
	
	void breathe() {
		System.out.println("������ ���� ���ϴ�.");
	}
	
	abstract void sound();
	
}
