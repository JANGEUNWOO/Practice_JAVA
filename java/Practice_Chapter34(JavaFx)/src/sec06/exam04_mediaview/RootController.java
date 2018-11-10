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

	private boolean endOfMedia; // 플래그 변수

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 재생할 소스(Media)를 생성함
		// 동영상
		// Media media = new
		// Media(getClass().getResource("media/video.m4v").toString());
		 Media media = new Media(getClass().getResource("media/피고인.mp4").toString());

		// 오디오
		//Media media = new Media(getClass().getResource("media/너무너무너무.mp3").toString());

		// MediaPlayer가 재생할 소스를 가진 Media클래스를 매개값으로 주면서 MediaPlayer를 생성함.
		MediaPlayer mediaPlayer = new MediaPlayer(media);

		// MediaPlayer가 재생하는 내용을 mediaView에 보여주고자 설정함.
		mediaView.setMediaPlayer(mediaPlayer);

		// 소스가 분석도 안된 상태에서 아래와 같이 play()를 호출하면 안됨
		// mediaPlayer.play();

		// 소스분석이 끝나고 Ready상태가 되면 아래와 같이 자동실행된다.(직접 익명구현객체 구현)
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				// setDiable메서드의 매개값이 true면 비활성화, false면 활성화를 해준다.
				btnPlay.setDisable(false); // Play버튼 활성화
				btnPause.setDisable(true); // Pause버튼 비활성화
				btnStop.setDisable(true); // Stop버튼 비활성화
			}
		});

		// 미디어 소스가 실행(Play)되고 있을 때를 감지해서 실행할 내용을 람다식으로 제공함.
		mediaPlayer.setOnPlaying(() -> {
			btnPlay.setDisable(true); // Play버튼 비활성화
			btnPause.setDisable(false); // Pause버튼 활성화
			btnStop.setDisable(false); // Stop버튼 활성화
		});

		// 미디어 소스가 일시정지(Pause)상태일 때 실행할 내용을 람다식으로 제공함.
		mediaPlayer.setOnPaused(() -> {
			btnPlay.setDisable(false); // Play버튼 활성화
			btnPause.setDisable(true); // Pause버튼 비활성화
			btnStop.setDisable(false); // Stop버튼 활성화
		});

		// 미디어 소스가 정지(Stop)상태일 때 실행할 내용을 람다식으로 제공함.
		mediaPlayer.setOnStopped(() -> {
			btnPlay.setDisable(false); // Play버튼 활성화
			btnPause.setDisable(true); // Pause버튼 비활성화
			btnStop.setDisable(true); // Stop버튼 비활성화
		});

		// 미디어 소스가 재생이 완료가 되었을 때 실행할 내용을 람다식으로 제공함.
		mediaPlayer.setOnEndOfMedia(() -> {
			btnPlay.setDisable(false); // Play버튼 활성화
			btnPause.setDisable(true); // Pause버튼 비활성화
			btnStop.setDisable(true); // Stop버튼 비활성화

			// 문제는 재생이 완료가 되어도 재생버튼은 활성화가 되어 클릭이 되지만 재생이 되지 않는다.
			// 이유는 재생완료시점에 그 소스의 상태가 머물러 있기 때문이다.
			// 그래서 명시적으로 stop()을 호출하고 그 소스의 시간을 맨 첨으로 돌려주는 코드를 코딩해야 한다.
			// 그래서 위에 선언한 플래스 변수를 true로 설정한다.
			endOfMedia = true;
		});

		// Play버튼을 클릭했을 때 동영상을 실행하는 이벤트 처리코드
		btnPlay.setOnAction(event -> {
			// 플래그변수가 true가 되었다는 것은 미디어의 재생이 완료가 되었다(endOfMedia) 라는 의미다.
			// 그래서 아래와 같이 명시적으로 stop()을 호출해주고 미디어의 시간을 처음으로 되돌린다.
			if (endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endOfMedia = false; // 다시 플래그변수를 false로 돌린다.
			}
			mediaPlayer.play();
		});

		// Pause버튼을 클릭했을 때 동영상이 일시정지되는 이벤트 처리코드
		btnPause.setOnAction(event -> mediaPlayer.pause());

		// Stop버튼을 클릭했을 때 동영상이 일시정지되는 이벤트 처리코드
		btnStop.setOnAction(event -> mediaPlayer.stop());
	}
}