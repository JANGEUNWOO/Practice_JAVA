package sec03_verify;

public class GoodExample {

	public static void main(String[] args) {
		
		Goods arr=new Goods();
		arr.setName("NIKON");
		arr.setPrice(400000);
		System.out.println("상품 이름 :"+arr.getName());
		System.out.println("상품 가격 :"+arr.getPrice());
		arr.setNumberOfStock(30);
		System.out.println("재고 수량 :"+arr.getNumberOfStock());
		arr.setSold(50);
		System.out.println("팔린 수량 :"+arr.getSold());
		
		

	}

}
