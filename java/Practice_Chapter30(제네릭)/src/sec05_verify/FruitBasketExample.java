package sec05_verify;

public class FruitBasketExample {

	public static void main(String[] args) {
		
		
		Fruit<String,Integer> fruit=new Fruit<String,Integer>();
		System.out.println("������ ���׿�");
		fruit.setK("���");
		fruit.setV(1500);
		System.out.println("���ϸ�:"+fruit.getK());
		System.out.println("����:"+fruit.getV());
		System.out.println();
		
		System.out.println("������ ��..");
		fruit.setK("��");
		fruit.setV(700);
		System.out.println("���ϸ�:"+fruit.getK());
		System.out.println("����:"+fruit.getV());
		System.out.println();
		
		System.out.println("������ ��..");
		fruit.setK("��");
		fruit.setV(3700);
		System.out.println("���ϸ�:"+fruit.getK());
		System.out.println("����:"+fruit.getV());

	}

}
