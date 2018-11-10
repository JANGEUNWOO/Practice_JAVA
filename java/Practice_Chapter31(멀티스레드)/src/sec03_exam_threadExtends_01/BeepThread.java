package sec03_exam_threadExtends_01;

import java.awt.Toolkit;

//Thread클래스로부터 상속을 받아서 작성한다.
public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
				}catch (InterruptedException e){}
		}
	}
}
