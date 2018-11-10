package sec01.exam09_Scrollbar;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollBarExample {

	public static void main(String[] args) {
		//Scrollbar�� ����ڰ� ������ ���� ���� �ִ� ���� ���� ������ �� �ֵ��� ���ִ�
		//������Ʈ�̴�. �ַ� ���������̳�, �ӵ�����, ���� ���ð� ���� ���� ����Ѵ�.
		
		Frame f=new Frame();
		f.setSize(300,200);
		f.setLayout(null);
		
		
		//���� ��ũ�ѹ�
		Scrollbar hor=new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,100);
		hor.setSize(60,100);
		
		//���� ��ũ�ѹ�
		Scrollbar ver=new Scrollbar(Scrollbar.VERTICAL,50,20,0,100);
		ver.setSize(15,100);
		ver.setLocation(30,30);
		f.add(hor);
		f.add(ver);
		f.setVisible(true);

	}

}
