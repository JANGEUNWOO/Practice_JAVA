package sec01_exam;

public class CardExample {

	public static void main(String[] args) {
		
		//stati�� �ν��Ͻ� ������� ���� ����
		System.out.println("Card.width="+Card.width);
		System.out.println("Card.height="+Card.height);
	   
		//c1�ν��Ͻ��� ����
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		//c2�ν��Ͻ��� ����
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		System.out.println("c1��"+c1.kind+", "+c1.number+"�̸�, ũ���("+c1.width+", "+c1.height+")");
		System.out.println("c2��"+c2.kind+", "+c2.number+"�̸�, ũ���("+c2.width+", "+c2.height+")");
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width=50; //Warning�� ��� ����?
		c1.height=80;
		
		System.out.println("c1��"+c1.kind+", "+c1.number+"�̸�, ũ���("+c1.width+", "+c1.height+")");
		System.out.println("c2��"+c2.kind+", "+c2.number+"�̸�, ũ���("+c2.width+", "+c2.height+")");
	}

}
