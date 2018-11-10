package sec02.exam03_BorderLayoutExample;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CardLayout_Example {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("CardLayoutTest");
		CardLayout card=new CardLayout(10,10);
		f.setLayout(card);
		
		//�����ӿ� ������ Panel�� 3�� �����Ѵ�.
		Panel card1=new Panel();
		card1.setBackground(Color.LIGHT_GRAY);
		card1.add(new Label("Card1"));
		
		Panel card2=new Panel();
		card2.setBackground(Color.ORANGE);
		card2.add(new Label("Card2"));
		
		Panel card3=new Panel();
		card3.setBackground(Color.CYAN);
		card3.add(new Label("Card3"));
		
		//Frame�� 3���� Panel�� �߰��ϰ� �ִ�.
		//�ڹ�fx�� stackpane�� ����� ����
		f.add(card1);
		f.add(card2);
		f.add(card3);
		
		//��øŬ���� Handler, MoustAdapter�߻�Ŭ������ ��ӹް� �ִ�.
		//���콺 �̺�Ʈ ó���κ��� �����ϰ� �ִ�.
		class Handler extends MouseAdapter{
			@Override
			public void mouseClicked(MouseEvent e) {
				//���콺 ������ ��ư�� ��������(���ϰ��� 4�̴�.)
				if(e.getModifiers()==InputEvent.BUTTON3_MASK) {
					System.out.println(e.getModifiers());
					card.previous(f); //CardLayout�� ���� Panel�� �����ش�.
				}
				else {
					card.next(f); //CardLayout�� ���� Panel�� �����ش�.
					System.out.println(e.getModifiers());
				}
			}
		}//class Handler
		//MouseAdapterŬ������ MouseeListener�������̽��� �����ϰ� �ֱ� ������
		//Handler�ν��Ͻ��� �Ű������� ���� �ִ�(�������̽��� ������)
		
		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setSize(300, 300);
		f.setLocation(500,500);
		f.setVisible(true);
		
		//�����ӿ� �߰��� Panel �� ó������ �߰��� ���� �����ش�.
		//������ �� �����ֱ� ���ؼ��� last(f)�� �����ϸ� �ȴ�.
		card.first(f);
		
		

	}

}
