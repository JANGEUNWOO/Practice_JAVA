package sec01.exam02_button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample01 {

	public static void main(String[] args) {
		
		Frame f=new Frame("Login");
		f.setSize(500,500);
		f.setLayout(null);  //���̾ƿ� �Ŵ����� ������ �����Ѵ�.
		

		Button b1=new Button("Ȯ��");
		b1.setSize(100,50);   //��ư1�� ũ�⸦ �����Ѵ�.
		b1.setLocation(110,50); //������ ������ ��ư1�� ��ġ�� �����Ѵ�.
		
		Button b2=new Button("���");
		b2.setSize(100,50);    //�����ӳ������� ��ư2 ũ�⸦ �����Ѵ�.
		b2.setLocation(220,50);
		
		
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
		f.setResizable(false); //����ڰ� �������� ũ �⸦ �����Ҽ� ������ �Ѵ�.
		

	}

}
