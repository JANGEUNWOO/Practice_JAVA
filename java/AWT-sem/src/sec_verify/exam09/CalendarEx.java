package sec_verify.exam09;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class CalendarEx extends Frame {
	
	Panel pUp = new Panel();
	Button btnPrevMon = new Button("��");
	Button btnNextMon = new Button("��");
	Label lblYearMon = new Label();
	Calendar curMon = Calendar.getInstance();
	
	public CalendarEx(String title) {
		super(title);
		pUp.setBackground(Color.yellow);
		pUp.setLayout(new FlowLayout(FlowLayout.CENTER));
		pUp.add(btnPrevMon);
		pUp.add(lblYearMon);
		pUp.add(btnNextMon);
		btnPrevMon.addActionListener(new BtnEventHandler());
		btnNextMon.addActionListener(new BtnEventHandler());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				we.getWindow().setVisible(false);
				we.getWindow().dispose();
				System.exit(0);
			}
		});
	
		add(pUp);
		setBounds(200,200,200,70);
		setDays(curMon);
		setVisible(true);
	}
	
	public void setDays(Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH); // 0~11�� ��ȯ�޴´�. 0�� 1���� �ǹ�.
		lblYearMon.setText(year+"�� "+(month+1)+"��");
	}
		
	class BtnEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Button src = (Button)e.getSource();
			// 1. ������ ��ư�� btnPrevMon�̸�, curMon�� �� �� �������� �����Ѵ�.
			if(src==btnPrevMon) {
			curMon.add(Calendar.MONTH, -1);
			// 2. ������ ��ư�� btnNextMon�̸�, curMon�� �� �� ���ķ� �����Ѵ�.
			}
			else if(src==btnNextMon) {
			curMon.add(Calendar.MONTH, 1);
			}
			// 3. setDays()�� ȣ���ؼ� ����� ������ ���̺� ���̰� �Ѵ�.
			setDays(curMon);
			repaint();
			
		}
	}
}
	
	
	
	
