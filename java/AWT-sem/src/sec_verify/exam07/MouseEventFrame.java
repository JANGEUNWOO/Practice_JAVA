package sec_verify.exam07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventFrame extends Frame {
	
	public MouseEventFrame(String title) {
		super("���콺 �ø��� ������ ����");			
		this.setLayout(new FlowLayout());
				
		Label label = new Label("Love Java");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Label la = (Label)e.getSource();
				la.setText("Love Java");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Label la = (Label)e.getSource();
				la.setText("�����");
			}			
		});
		
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {			
				System.exit(0);
			}
		};
		
		this.add(label);
		this.addWindowListener(wa);
		this.setSize(350,150);
		this.setVisible(true);
	}
}
