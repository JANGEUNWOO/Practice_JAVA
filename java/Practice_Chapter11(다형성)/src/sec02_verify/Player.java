package sec02_verify;

public class Player {

	
	private String name;
	private int age;
	private int backNumber;
	protected int spd;
	
	public Player(String name,int age, int backNumber,int spd) {
	    this.name=name;
	    this.age=age;
	    this.backNumber=backNumber;
	    this.spd=spd;
	}
	
	void setName(String name) {
		
	}
	
	void setAge(int age) {
		
	}
	
	void setBackNumber(int backNumber) {
		
	}
	
	void setSpd(int spd) {
		
	}
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public int getSpd() {
		return spd;
	}
	
	void infoPrint() {
		
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("���ȣ:"+backNumber);
		System.out.println("���ǵ�:"+spd);
		
	}
	
	
}
