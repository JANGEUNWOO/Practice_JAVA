package sec03_verify;

public class GoodExample {

	public static void main(String[] args) {
		
		Goods arr=new Goods();
		arr.setName("NIKON");
		arr.setPrice(400000);
		System.out.println("��ǰ �̸� :"+arr.getName());
		System.out.println("��ǰ ���� :"+arr.getPrice());
		arr.setNumberOfStock(30);
		System.out.println("��� ���� :"+arr.getNumberOfStock());
		arr.setSold(50);
		System.out.println("�ȸ� ���� :"+arr.getSold());
		
		

	}

}
