package sec14_exam02_thread_interrupt;

import javax.swing.JOptionPane;

public class InterruptExample {

	public static void main(String[] args) {
		
		CountThread countThread=new CountThread();
		countThread.start();
		
		String input=JOptionPane.showInputDialog("아무 값아나 입력해");
		System.out.println("입력하신 값은"+input+"입니다.");
		
		//interrupt()를 호출하면 interrupted형태가 true가된다.
		countThread.interrupt();
		//true
		System.out.println("isInterrupted():"+countThread.isInterrupted());
	}

}
