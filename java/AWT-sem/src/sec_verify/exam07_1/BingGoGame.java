package sec_verify.exam07_1;

import java.awt.*;
import java.awt.event.*;

public class BingGoGame extends Frame {
	
	final int SIZE = 5; // �������� ũ��
	Button[] btnArr = null;
	
	// ��ư�� ���� ���ڿ���
	String[] birds = { 
						"����","�η��","Ȳ��","��ѱ�","�����",
						"����","Ÿ��","�ξ���","�û���","���",
						"��","��","������","�ײ�","��",
						"����","������","�ܵ�","��Ȳ","����",
						"��ġ","���","�޹���","�Ҳ���","���"
					 };
	
	public BingGoGame() {
		this("Bingo Game");
	}
	
	public BingGoGame(String title) {
		super(title);
		setLayout(new GridLayout(SIZE, SIZE)); // Frame�� layout�� GridLayout����
		
		MyEventHandler handler = new MyEventHandler();
		addWindowListener(handler);
		
		btnArr = new Button[SIZE*SIZE]; // 5*5=25���� ��ư�� ���� ��ü�迭�� �����.
		
		// Frame�� ��ư�� �߰��Ѵ�.
		for(int i=0; i < SIZE*SIZE;i++) {
			btnArr[i] = new Button(birds[i]);//�迭 birds�� ���� ��ư�� Label�� �Ѵ�.
			btnArr[i].addActionListener(handler); // ��ư�� �̺�Ʈ�����ʸ� �߰�
			add(btnArr[i]); // ��ư�� Frame�� �߰��Ѵ�.
		}
		setBounds(500, 200, 300, 300);
		setVisible(true);
	}

	class MyEventHandler extends WindowAdapter implements ActionListener {
	
		public void actionPerformed(ActionEvent ae) {
			Button btn = (Button)ae.getSource();
			System.out.println(btn.getLabel()); // ������ ��ư�� Label�� �ֿܼ� ���
			btn.setBackground(Color.LIGHT_GRAY); // ��׶��带 ���� ȸ������ ����
		
		}
		// Frame�� ���� ����� x��ư(�ݱ��ư)�� ������ ���α׷��� �����Ѵ�.
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		}
	} // MyEventHandler
}
