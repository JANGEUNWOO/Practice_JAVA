package sec01.exam02_button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample02 {

	public static void main(String[] args) {
		// ������(������ �����̳� ����)
		// �����̳ʴ� ������Ʈ�� ���� �� �ִ�.
		// �������� �⺻���� ���̾ƿ��Ŵ����� BorderLayout Manager
		Frame f=new Frame("Login");
		f.setSize(500,500);
		f.setLayout(null);
		
		//��ư ����
		//button���� "Ȯ��"�̶�� ���ڰ� ��Ÿ����.
		Button b1=new Button("Ȯ��");
		Button b2=new Button("���");
		
		//button2�� ũ�⸦ �����Ѵ�.
		b1.setSize(100,50);
		b2.setSize(100,50);
		b1.setLocation(110,50);
		b2.setLocation(220,50);
		
		//������ Button�� frame�� ���Խ�Ų��.
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
		
		/* 
		 * ������ ���Ѻ��� �и� ��ư�� ����� 100,50�ε� �������� �� �����ϰ� �ִ�.
		 * �̰��� ���̾ƿ��Ŵ����� �⺻������ borderlayout���� frame�� �����ϰ� �ֱ� �����̴�.
		 * �̰��� setlayout()�޼��带 �̿��ؼ� �ٲܼ��� �ִ�.
		 */

	}

}
