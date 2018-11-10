package sec03_exam_threadExtends_02;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

import javax.swing.JOptionPane;

public class InputDialogExample {

	public static void main(String[] args) {
		
		TimerThread t = new TimerThread();
		t.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다. ");
		
	/*	Frame f = new Frame();
		TextField tf = new TextField(10);
		f.setLayout(new FlowLayout());
		f.setSize(100, 50);
		tf.setSize(100,50);
		f.add(tf);
		f.setVisible(true);
		System.out.println("입력하신 값은 "+ tf.getText());
*/
	}

}
