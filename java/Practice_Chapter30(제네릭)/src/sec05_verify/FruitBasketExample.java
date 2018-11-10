package sec05_verify;

public class FruitBasketExample {

	public static void main(String[] args) {
		
		
		Fruit<String,Integer> fruit=new Fruit<String,Integer>();
		System.out.println("과일이 담겼네요");
		fruit.setK("사과");
		fruit.setV(1500);
		System.out.println("과일명:"+fruit.getK());
		System.out.println("가격:"+fruit.getV());
		System.out.println();
		
		System.out.println("과일이 또..");
		fruit.setK("귤");
		fruit.setV(700);
		System.out.println("과일명:"+fruit.getK());
		System.out.println("가격:"+fruit.getV());
		System.out.println();
		
		System.out.println("과일이 또..");
		fruit.setK("배");
		fruit.setV(3700);
		System.out.println("과일명:"+fruit.getK());
		System.out.println("가격:"+fruit.getV());

	}

}
