package sec10.exam01;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {

	// fxml 컨트롤 참조.
	@FXML
	private Label lblTime;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;

	private boolean stop; // 플래그변수

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 이벤트 처리 부분(람다식)
		btnStart.setOnAction(event -> handleBtnStart(event));
		btnStop.setOnAction(event -> handleBtnStop(event));
	}

	public void handleBtnStart(ActionEvent e) {
		stop = false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				while (!stop) {
					// 계속 시스템의 시간을 얻어온다.
					String strTime = sdf.format(new Date());

					// 작업스레드가 직접 UI를 변경하는 코드가 들어가면 예외가 발생하는 것을 확인 가능
					// lblTime.setText(strTime);
					// System.out.println("현재시간:"+strTime);

					// 작업스레드가 계속적으로 시스템으로부터 시간을 얻어오고 그것을 이벤트 뒤에 저장을
					// 해주면 JavaFXApplication Thread가 그 이벤트를 가져와서
					// Platform.runLater()를 실행한다.
					// 하여, UI를 변경하는데 별 문제가 없는 것.

					// 람다식
					Platform.runLater(() -> {
						lblTime.setText(strTime);
					});

					// 직접 익명구현객체 생성
					/*
					 * Platform.runLater(new Runnable(){
					 * 
					 * @Override public void run(){ lblTime.setText(strTime); } });
					 */
					// 스레드가 너무 빨리 실행되므로 sleep()를 호출
					try {
						Thread.sleep(100);

					} catch (InterruptedException e) {
					}
				}

			};
		};
		// 데몬 설정
		thread.setDaemon(true);
		// 작업스레드 시작
		thread.start();
	}

	public void handleBtnStop(ActionEvent e) {
		stop = true;
		// platform.exit();
	}
}
