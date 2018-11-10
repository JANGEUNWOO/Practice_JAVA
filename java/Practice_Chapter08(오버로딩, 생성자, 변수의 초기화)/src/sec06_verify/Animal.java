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
		String str="이 동물의 이름은"+this.name+",나이는"+
		      this.age+"입니다.";
		   return str;
	}
}
