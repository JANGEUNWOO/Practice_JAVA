package sec02.exam03_BorderLayoutExample;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayout_Example {

	public static void main(String[] args) {
		Frame f=new Frame("GridLayoutTest");
		f.setSize(300,200);
		f.setLayout(new GridLayout(3,2));//3�� 2���� ���̺��� �����.
		
		//3��2���� ���̺��� �����.(�� ���� 10�� ����)
		//f.setLayout(new GridLayout(3,2,10,10));
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		

	}

}
