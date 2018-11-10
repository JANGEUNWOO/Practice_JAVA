package sec02_reflection;

public class Car {
	//인스턴스 멤버 변수
	private String model;
    private String owner;
    
    
    //생성자 오버로딩
    public Car() {}
    
    public Car(String mode, String owner) {
    	this.model=model;
    	this.owner=owner;
    }
    
    //인스턴스 멤버 메서드 getter setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
    
} 

