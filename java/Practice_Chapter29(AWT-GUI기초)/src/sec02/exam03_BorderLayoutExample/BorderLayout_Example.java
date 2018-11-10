package sec02.exam03_BorderLayoutExample;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayout_Example {

	public static void main(String[] args) {
		
		Frame f=new Frame("BorderLayoutTest");
		f.setSize(300,300);
		//Frame�� �⺻������ BorderLayout�� �����Ǿ� �����Ƿ� ���� ��������
		f.setLayout(new BorderLayout(10,10));
		Button north=new Button("North");
		Button south=new Button("North");
		Button east=new Button("North");
		Button west=new Button("North");
		Button center=new Button("North");
		
		/*Frame�� 5���� �� ������ Button�� �ϳ��� �߰��Ѵ�.
		 * �Ʒ��� borderLayout�� ������ ������ ������ ��ư�� �߰��Ͽ���.
		 * f.add("North",north)�� Ȥ�� f.add(north,"North")�� ���� �� ���� �ִ�.
		 * ������, �Ʒ��� ���� ���� ���� �������� ����.
		 */

		f.add(BorderLayout.NORTH, north);
		f.add(BorderLayout.SOUTH, south);
		f.add(BorderLayout.EAST, east);
		f.add(BorderLayout.WEST, west);
		f.add(BorderLayout.CENTER, center);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
	}

}
