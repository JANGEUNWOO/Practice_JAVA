package sec_verify.exam12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends Panel {
	
	Label[] label = new Label[3]; // 3 ���� ���� ǥ���ϴ� ���̺� �迭
	Label result = new Label("������ Ŭ���ϸ� ������ �����մϴ�!"); // ����� ����ϴ� ���̺�
	Button btnStart = new Button("�� ��");
	Button btnStop = new Button("�� ��");
	GamblingThread thread = new GamblingThread(label, result); // ���� ������
	
	
	
	public GamePanel() {
		System.out.println("33");
		
		this.setLayout(null); // ��ġ�����ڸ� ������� �ʰ� ���� ��ġ�� ������Ʈ�� ��ġ�Ѵ�.
		this.setSize(300, 250);
		this.setBackground(Color.BLUE);
		//3 ���� ���̺��� �����Ͽ� �����̳ʿ� �ܴ�.
		for(int i=0; i<label.length; i++) {
			label[i] = new Label("0"); // ���̺� ����
			label[i].setSize(60, 30); // ���̺� ũ��
			label[i].setLocation(30 + 80 * i, 50); // ���̺� ��ġ
			label[i].setAlignment(Label.CENTER); // ���̺� ��µǴ� ���� ���͸�
			
			label[i].setBackground(Color.WHITE); // ���̺��� ������ �����Ѵ�.
			label[i].setForeground(Color.black); //���̺��� ���� ���� �����Ѵ�.				
			label[i].setFont(new Font("Tahoma", Font.ITALIC, 30)); // ���̺� ������ ��Ʈ�� �����Ѵ�.	
			this.add(label[i]); // ���̺��� �����Ѵ�.
		}
		
		//����� ����� ���̺��� �����ϰ� �����̳ʿ� �����Ѵ�.
		result.setAlignment(Label.CENTER); // ���̺� ��µǴ� ���� ���͸�
		result.setFont(new Font("Tahoma", Font.ITALIC, 15));
		result.setForeground(Color.WHITE);
		result.setSize(250, 50);
		result.setLocation(20, 100);
		
		btnStart.setSize(50, 30);
		btnStart.setLocation(70, 160);
		
		btnStop.setSize(50, 30);
		btnStop.setLocation(150, 160);
		
		this.add(btnStart);
		this.add(btnStop);
		this.add(result);
		
		//System.out.println("44");
		
		thread.start();		
		//��ư�� ActionListener�� �����Ѵ�.
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(thread.isReady()) // �����尡 ���� ���̸� �׳� ����
					thread.startGambling();
				
			}
		});		
		btnStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
	}
}