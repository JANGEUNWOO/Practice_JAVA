package sec02_verify;

public abstract class Phone {

	String owner;
	
	
	Phone(String owner){
		this.owner=owner;
	}
	
	String getOwner() {
		return owner+"�� ���Դϴ�.";
	}
	
	abstract void turnOn();
	
	abstract void turnOff();	
	
	
	
}
