package sec02_reflection;

public class Car {
	//�ν��Ͻ� ��� ����
	private String model;
    private String owner;
    
    
    //������ �����ε�
    public Car() {}
    
    public Car(String mode, String owner) {
    	this.model=model;
    	this.owner=owner;
    }
    
    //�ν��Ͻ� ��� �޼��� getter setter
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

