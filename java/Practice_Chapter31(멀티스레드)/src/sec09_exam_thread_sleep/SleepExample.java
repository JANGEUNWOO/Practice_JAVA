package sec09_exam_thread_sleep;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 10; i++) {
			toolkit.beep(); // ¶ò ¼Ò¸®
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
