package sec06.exam04_mediaview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable {
	@FXML
	ImageView imageView;
	@FXML
	MediaView mediaView;
	@FXML
	Button btnPlay;
	@FXML
	Button btnPause;
	@FXML
	Button btnStop;

	private boolean endOfMedia; // �÷��� ����

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// ����� �ҽ�(Media)�� ������
		// ������
		// Media media = new
		// Media(getClass().getResource("media/video.m4v").toString());
		 Media media = new Media(getClass().getResource("media/�ǰ���.mp4").toString());

		// �����
		//Media media = new Media(getClass().getResource("media/�ʹ��ʹ��ʹ�.mp3").toString());

		// MediaPlayer�� ����� �ҽ��� ���� MediaŬ������ �Ű������� �ָ鼭 MediaPlayer�� ������.
		MediaPlayer mediaPlayer = new MediaPlayer(media);

		// MediaPlayer�� ����ϴ� ������ mediaView�� �����ְ��� ������.
		mediaView.setMediaPlayer(mediaPlayer);

		// �ҽ��� �м��� �ȵ� ���¿��� �Ʒ��� ���� play()�� ȣ���ϸ� �ȵ�
		// mediaPlayer.play();

		// �ҽ��м��� ������ Ready���°� �Ǹ� �Ʒ��� ���� �ڵ�����ȴ�.(���� �͸�����ü ����)
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				// setDiable�޼����� �Ű����� true�� ��Ȱ��ȭ, false�� Ȱ��ȭ�� ���ش�.
				btnPlay.setDisable(false); // Play��ư Ȱ��ȭ
				btnPause.setDisable(true); // Pause��ư ��Ȱ��ȭ
				btnStop.setDisable(true); // Stop��ư ��Ȱ��ȭ
			}
		});

		// �̵�� �ҽ��� ����(Play)�ǰ� ���� ���� �����ؼ� ������ ������ ���ٽ����� ������.
		mediaPlayer.setOnPlaying(() -> {
			btnPlay.setDisable(true); // Play��ư ��Ȱ��ȭ
			btnPause.setDisable(false); // Pause��ư Ȱ��ȭ
			btnStop.setDisable(false); // Stop��ư Ȱ��ȭ
		});

		// �̵�� �ҽ��� �Ͻ�����(Pause)������ �� ������ ������ ���ٽ����� ������.
		mediaPlayer.setOnPaused(() -> {
			btnPlay.setDisable(false); // Play��ư Ȱ��ȭ
			btnPause.setDisable(true); // Pause��ư ��Ȱ��ȭ
			btnStop.setDisable(false); // Stop��ư Ȱ��ȭ
		});

		// �̵�� �ҽ��� ����(Stop)������ �� ������ ������ ���ٽ����� ������.
		mediaPlayer.setOnStopped(() -> {
			btnPlay.setDisable(false); // Play��ư Ȱ��ȭ
			btnPause.setDisable(true); // Pause��ư ��Ȱ��ȭ
			btnStop.setDisable(true); // Stop��ư ��Ȱ��ȭ
		});

		// �̵�� �ҽ��� ����� �Ϸᰡ �Ǿ��� �� ������ ������ ���ٽ����� ������.
		mediaPlayer.setOnEndOfMedia(() -> {
			btnPlay.setDisable(false); // Play��ư Ȱ��ȭ
			btnPause.setDisable(true); // Pause��ư ��Ȱ��ȭ
			btnStop.setDisable(true); // Stop��ư ��Ȱ��ȭ

			// ������ ����� �Ϸᰡ �Ǿ �����ư�� Ȱ��ȭ�� �Ǿ� Ŭ���� ������ ����� ���� �ʴ´�.
			// ������ ����Ϸ������ �� �ҽ��� ���°� �ӹ��� �ֱ� �����̴�.
			// �׷��� ��������� stop()�� ȣ���ϰ� �� �ҽ��� �ð��� �� ÷���� �����ִ� �ڵ带 �ڵ��ؾ� �Ѵ�.
			// �׷��� ���� ������ �÷��� ������ true�� �����Ѵ�.
			endOfMedia = true;
		});

		// Play��ư�� Ŭ������ �� �������� �����ϴ� �̺�Ʈ ó���ڵ�
		btnPlay.setOnAction(event -> {
			// �÷��׺����� true�� �Ǿ��ٴ� ���� �̵���� ����� �Ϸᰡ �Ǿ���(endOfMedia) ��� �ǹ̴�.
			// �׷��� �Ʒ��� ���� ��������� stop()�� ȣ�����ְ� �̵���� �ð��� ó������ �ǵ�����.
			if (endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endOfMedia = false; // �ٽ� �÷��׺����� false�� ������.
			}
			mediaPlayer.play();
		});

		// Pause��ư�� Ŭ������ �� �������� �Ͻ������Ǵ� �̺�Ʈ ó���ڵ�
		btnPause.setOnAction(event -> mediaPlayer.pause());

		// Stop��ư�� Ŭ������ �� �������� �Ͻ������Ǵ� �̺�Ʈ ó���ڵ�
		btnStop.setOnAction(event -> mediaPlayer.stop());
	}
}