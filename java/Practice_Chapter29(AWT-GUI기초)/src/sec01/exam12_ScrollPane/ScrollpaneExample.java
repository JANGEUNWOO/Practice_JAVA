package sec01.exam12_ScrollPane;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollpaneExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("ScrollPaneExample");
		f.setSize(300,300);
		
		ScrollPane sp=new ScrollPane();  //ScrollPane����
		Panel p=new Panel();
		p.setBackground(Color.GREEN); //panel�� ����� green���� ��
		for(int i=0;i<30;i++) {
			p.add(new Button("��"+i));
		}
		
		/*Scrollpane�� ������ �����̳ʷ� �� �ϳ��� ������Ʈ�� ���Խ�ų�� �ִ�.
		 * ũ�⸦  �ٿ��� �÷ȴ� �ϸ� ��ũ�ѹٰ� �ڵ� �����Ǵ� ���� �� �� �ִ�.
		 * ������ Panel�ȿ� 4���� ��ư�� �����Ͽ���, �� Panel�� �ٽ� SCrollpane���Ϳ��ʿ� 
		 * ���Խ��װ� �ٽ� SCrollpane�����̳ʸ� frame�����̳ʿ� ���Խ�Ų ���̴�.
		 * ����11�� ���غ��� �� ���̸� ���� �� �ִ�. ��ũ���� ����鼭 ȭ���� �ٿ��� ������Ʈ���� ������ �ִ�.
		 */
		sp.add(p); //panel�� Scrollpane�� ���Խ�Ų��.
        f.add(sp); //scrollpane�� frame�� ���Խ�Ų��.
        f.setVisible(true);
	}

}
