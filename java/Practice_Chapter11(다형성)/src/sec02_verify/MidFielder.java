package sec02_verify;

public class MidFielder extends Player {

	int pass;
	
	public MidFielder(String name, int age, int backNumber, int spd,int pass) {
		super(name, age, backNumber, spd);
		this.pass=pass;
    }

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
	
	void infoPrint() {
		System.out.println("�̵��ʴ� ������ �Ұ��մϴ�.");
		super.infoPrint();
		System.out.println("�о�Ƚ��:"+pass);
	}
}
