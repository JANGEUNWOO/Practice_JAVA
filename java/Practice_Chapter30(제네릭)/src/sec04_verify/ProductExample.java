package sec04_verify;

public class ProductExample {

	public static void main(String[] args) {

		Product<Audio, String> p2 = new Product<Audio, String>();

		p2.setA(new Audio("Sony", "�ֻ�", 4));
		p2.setM("");
		System.out.println(p2.getA());

		
		
		System.out.println("");
		
		
		
		Product<Monitor, Integer> p1 = new Product<Monitor, Integer>();

		System.out.println("������� ��");
		p1.setA(new Monitor("�Ｚ", 27));
		p1.setM(370000);
		System.out.println(p1.getA());
		System.out.println(p1.getM());

	}

}
