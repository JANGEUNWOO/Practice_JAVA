package sec02_verify;

public class MoutainBikeExample {

	public static void main(String[] args) {
		
		MoutainBike mb=new MoutainBike(1,"Scott");
		mb.gear=30;
		mb.frame="ī��";
		mb.money="8õ��";
		mb.prtlnfo();
		System.out.println();
		
		MoutainBike ab=new MoutainBike(2,"Giant");
		ab.gear=27;
		ab.frame="�˹̴�";
		ab.money="30��";
		ab.prtlnfo();
		System.out.println();
		
		MoutainBike bb=new MoutainBike(3,"Lespo");
		bb.gear=18;
		bb.frame="ö";
		bb.money="5��";
		bb.prtlnfo();
		System.out.println();

	}

}
