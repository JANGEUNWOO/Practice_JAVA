package sec_verify.exam12;

import java.awt.Color;
import java.awt.Label;

public class GamblingThread extends Thread {
	
	Label[] label; //���� ���ڸ� ����ϴ� ���̺�
	Label result;  //����� ����ϴ� ���̺�
	long delay = 300; //���� �ð��� �ʱ갪 = 200
	boolean gambling = false; //������ �� ������. �ʱ갪 = false
	
	public GamblingThread(Label[] label, Label result) {
		this.label = label;
		this.result = result;
	}
	
	boolean isReady() {
		return !gambling; //���� ���̸� �غ���� �ʾ���
	}
	
	public synchronized void waitForGambling() {
		if(!gambling) //���콺 Ŭ���� ���� gambling�� true�� �ƴϸ� ��ٸ�
			try {
				this.wait();
			} catch (InterruptedException e) {}
	}
	
	public synchronized void startGambling() {
		this.gambling = true; //���콺 Ŭ������ �����尡 ������ �����ϵ��� ����
		this.notify(); //��ٸ��� �����带 ����
	}		
	@Override
	public void run() {
		while(true) {
			waitForGambling(); //���콺 Ŭ���� ���� ���� ���� ���ø� ��ٸ�
			try {
				int x1 = (int)(Math.random()*3) + 1; //1~3������ ������
				int x2 = (int)(Math.random()*3) + 1; //1~3������ ������
				int x3 = (int)(Math.random()*3) + 1; //1~3������ ������
				
				//ù��° �� ����
				label[0].setForeground(Color.RED); // ���ڰ� �ٲ�� ���� ����ȭ�ϱ� ����
				sleep(delay);
				label[0].setForeground(Color.BLACK);
				label[0].setText(Integer.toString(x1));
				
				//�ι�° �� ����					
				label[1].setForeground(Color.RED); // ���ڰ� �ٲ�� ���� ����ȭ�ϱ� ����
				sleep(delay);
				label[1].setForeground(Color.BLACK);					
				label[1].setText(Integer.toString(x2));
				
				//����° �� ����
				label[2].setForeground(Color.RED); // ���ڰ� �ٲ�� ���� ����ȭ�ϱ� ����
				sleep(delay);
				label[2].setForeground(Color.BLACK);					
				label[2].setText(Integer.toString(x3));	
				
				// ������ �����Ͽ����� �Ǻ�
				if(x1 == x2 && x2 == x3)
					result.setText("�����մϴ�!!");
				else 
					result.setText("�ƽ�����");
				gambling = false; // ���� ���� ������ �����ϵ��� ����
			} catch (InterruptedException e) {}
		}
	}	
}


