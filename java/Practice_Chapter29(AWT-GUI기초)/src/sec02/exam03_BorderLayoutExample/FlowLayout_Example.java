package sec02.exam03_BorderLayoutExample;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayout_Example {

	public static void main(String[] args) {
		Frame f=new Frame("FlowLayoutTest");
		f.setSize(300,200);
		
		//�߾������� FlowLayOut����
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//���������� �ϵ�, ����, ���� ���� 10�� ����
		//f.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		f.add(new Button("ù��°"));
		f.add(new Button("�ι�°"));
		f.add(new Button("����°"));
		f.add(new Button("�׹�°"));
		f.add(new Button("�ټ���°"));
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//���콺�� �������� �ٿ��� �÷ȴ� �غ���.
		f.setVisible(true);

	}

}
