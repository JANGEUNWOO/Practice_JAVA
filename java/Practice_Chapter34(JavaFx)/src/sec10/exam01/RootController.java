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

	// fxml ��Ʈ�� ����.
	@FXML
	private Label lblTime;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;

	private boolean stop; // �÷��׺���

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// �̺�Ʈ ó�� �κ�(���ٽ�)
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
					// ��� �ý����� �ð��� ���´�.
					String strTime = sdf.format(new Date());

					// �۾������尡 ���� UI�� �����ϴ� �ڵ尡 ���� ���ܰ� �߻��ϴ� ���� Ȯ�� ����
					// lblTime.setText(strTime);
					// System.out.println("����ð�:"+strTime);

					// �۾������尡 ��������� �ý������κ��� �ð��� ������ �װ��� �̺�Ʈ �ڿ� ������
					// ���ָ� JavaFXApplication Thread�� �� �̺�Ʈ�� �����ͼ�
					// Platform.runLater()�� �����Ѵ�.
					// �Ͽ�, UI�� �����ϴµ� �� ������ ���� ��.

					// ���ٽ�
					Platform.runLater(() -> {
						lblTime.setText(strTime);
					});

					// ���� �͸�����ü ����
					/*
					 * Platform.runLater(new Runnable(){
					 * 
					 * @Override public void run(){ lblTime.setText(strTime); } });
					 */
					// �����尡 �ʹ� ���� ����ǹǷ� sleep()�� ȣ��
					try {
						Thread.sleep(100);

					} catch (InterruptedException e) {
					}
				}

			};
		};
		// ���� ����
		thread.setDaemon(true);
		// �۾������� ����
		thread.start();
	}

	public void handleBtnStop(ActionEvent e) {
		stop = true;
		// platform.exit();
	}
}
