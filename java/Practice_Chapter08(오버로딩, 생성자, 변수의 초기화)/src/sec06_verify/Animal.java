package sec06_verify;

public class Animal {

	
	
	String name;
	int age;
	
	Animal(){};
	Animal(String name){
		this.name=name;
	}
	Animal(String name, int age){
		this.name=name;
		this.age=age;
	}

	
	
	@Override
	public String toString() {
		String str="�� ������ �̸���"+this.name+",���̴�"+
		      this.age+"�Դϴ�.";
		   return str;
	}
}
