package sec02_verify;

public class Goalkeeper extends Player {
	
	int save;
	
	public Goalkeeper(String name, int age, int backNumber, int spd,int save) {
		super(name, age, backNumber, spd);
		this.save=save;
	}

	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}
	
	void infoPrint() {
		System.out.println("°ñÅ°ÆÛ¸¦ ¼Ò°³ÇÕ´Ï´Ù.");
		super.infoPrint();
		System.out.println("¼¼ÀÌºù È½¼ö:"+save);
	}
}
