package sec14_exam02_thread_interrupt;

import javax.swing.JOptionPane;

public class InterruptExample {

	public static void main(String[] args) {
		
		CountThread countThread=new CountThread();
		countThread.start();
		
		String input=JOptionPane.showInputDialog("�ƹ� ���Ƴ� �Է���");
		System.out.println("�Է��Ͻ� ����"+input+"�Դϴ�.");
		
		//interrupt()�� ȣ���ϸ� interrupted���°� true���ȴ�.
		countThread.interrupt();
		//true
		System.out.println("isInterrupted():"+countThread.isInterrupted());
	}

}
