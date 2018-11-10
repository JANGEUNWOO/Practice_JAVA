package sec_verify08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeThread extends Thread {

	public void run() {

		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			Date now = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String str = sd.format(now);
			System.out.println("오늘 날짜 및 시간 : " + str);

		}

	}

}
