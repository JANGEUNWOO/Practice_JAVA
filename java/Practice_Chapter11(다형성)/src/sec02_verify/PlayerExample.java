package sec02_verify;

public class PlayerExample {

	public static void main(String[] args) {
		
		
		Striker st=null;
		Striker st1=null;
		MidFielder mid=null;
        Defender def=null;
		Goalkeeper keep=null;
		
		
		
		Player p1=new Striker("�̵���",36,20,60,70);
		st=(Striker)p1;
		st.infoPrint();

		Player p2=new Striker("�޽�",28,10,97,98);
		st1=(Striker)p2;
		st1.infoPrint();
		
		Player p3=new MidFielder("������",34,7,85,85);
		mid=(MidFielder)p3;
		mid.infoPrint();
		
		Player p4=new Defender("�迵��",31,33,80,99);
		def=(Defender)p4;
		def.infoPrint();
		
		Player p5=new Goalkeeper("�̿���",40,28,45,99);
		keep=(Goalkeeper)p5;
		keep.infoPrint();
	}

}
