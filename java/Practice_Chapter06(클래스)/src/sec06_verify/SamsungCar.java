package sec06_verify;

public class SamsungCar {

	
	  String company;
	  String model;
	  String color;
	  int maxSpeed;
	  int speed;
	  
	  public void SpeedDown() {
		  if(this.speed<0) {
				System.out.println("�ӵ��� �������� �����ϴ�. �ڷ� �����?");
	   }
	  }

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	@Override
	public String toString() {
		return this.company+"ȸ����"+this.color+"������"+this.model+"���̸�,"+this.maxSpeed+"�� �ְ�ӵ��� �ڶ��մϴ�.";
	}
	
	  
	
	
}
