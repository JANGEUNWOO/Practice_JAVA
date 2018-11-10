package sec01.exam11_Panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelExample {

	public static void main(String[] args) {
		 
        
		Frame f=new Frame();
		f.setSize(500,500);
		f.setLayout(null);  //frame�� layoutmanager�� ������� �ʵ��� �Ѵ�.
		
		//panel�� �������� �����̳ʷν� �⺻������ flowlayout()�� ����Ѵ�.
		//���� panel�ȿ� �� ������Ʈ�� ��ġ�� ���� ���������� �ʾƵ� �ȴ�.
		
		Panel p= new Panel();
		p.setBackground(Color.GREEN);  //panel�� ����� �������
		p.setSize(300,300);
		p.setLocation(50,50);
		
		Button ok =new Button("ok");
		Button cancel=new Button("Cancel");
		
		//���� ��ư���� Panel�����̳ʿ� �߰��� �Ǳ� ������ ������ �����̳ʿ�
		//����� �޴� ���� �ƴ϶� panel�����̳��� ���̾ƿ��Ŵ����� ������ �޴´�.
		
		p.add(ok);  //Button�� Panel�� ���Խ�Ų��.
		p.add(cancel); //Button�� panel�� ���Խ�Ų��.
		f.add(p); //panel�� frame�� ���Խ�Ų��.
		f.setVisible(true);
				
		
	}

}
