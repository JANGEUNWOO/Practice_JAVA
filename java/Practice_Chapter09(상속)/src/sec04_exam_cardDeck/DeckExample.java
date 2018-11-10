package sec04_exam_cardDeck;

public class DeckExample {

	public static void main(String[] args) {
		
		
		Deck d=new Deck();  //카드 한 벌(Deck)을 만든다.
		Card c=d.pick(0); //섞기 전에 제일 위의 카드를 뽑는다.
		
		System.out.print("카드 섞기 전 제일 위에 있는 카드:");
		System.out.println(c.toString());
		
		d.shuffle();    //카드를 섞는다
		
		
		c=d.pick(0);   //섞은 후에 제일 위의 카드를 뽑는다.
		System.out.print("카드 섞기 후 제일 위에 있는 카드:");
		System.out.println(c.toString());
		
		c=d.pick(10);  //11번째 카드를 뽑는다.
		
		System.out.print("카드 섞기 후 11번째에 있는 카드: ");
		System.out.println(c.toString());
		
		c=d.pick();
		System.out.print("카드를 임의로 뽑아본 카드: ");
		System.out.println(c.toString());
		
	}

}
