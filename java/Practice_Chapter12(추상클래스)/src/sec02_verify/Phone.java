package sec02_verify;

public abstract class Phone {

	String owner;
	
	
	Phone(String owner){
		this.owner=owner;
	}
	
	String getOwner() {
		return owner+"의 폰입니다.";
	}
	
	abstract void turnOn();
	
	abstract void turnOff();	
	
	
	
}
