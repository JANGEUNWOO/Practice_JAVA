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
		System.out.println("미드필더 선수를 소개합니다.");
		super.infoPrint();
		System.out.println("패쓰횟수:"+pass);
	}
}
