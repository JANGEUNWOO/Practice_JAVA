package sec01_exam;

public class CardExample {

	public static void main(String[] args) {
		
		//stati은 인스턴스 생성없어도 접근 가능
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
	   
		//c1인스턴스를 생성
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		//c2인스턴스를 생성
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		System.out.println("c1은"+c1.kind+", "+c1.number+"이며, 크기는("+c1.width+", "+c1.height+")");
		System.out.println("c2는"+c2.kind+", "+c2.number+"이며, 크기는("+c2.width+", "+c2.height+")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width=50; //Warning이 뜬다 이유?
		c1.height=80;
		
		System.out.println("c1은"+c1.kind+", "+c1.number+"이며, 크기는("+c1.width+", "+c1.height+")");
		System.out.println("c2는"+c2.kind+", "+c2.number+"이며, 크기는("+c2.width+", "+c2.height+")");
	}

}
