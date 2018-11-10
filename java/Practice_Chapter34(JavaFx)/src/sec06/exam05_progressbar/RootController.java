package sec06.exam05_progressbar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

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
   
   @FXML
   private Label labelTime;
   @FXML
   private ProgressBar progressBar;
   @FXML
   private ProgressIndicator progressIndicator;
   @FXML
   private Slider sliderVolume;
   @FXML
   private Slider sliderMedia;

   private boolean endOfMedia; // 플래그 변수

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      // 재생할 소스(Media)를 생성함
      // 동영상
      // Media media = new Media(getClass().getResource("media/video.m4v").toString());
      // Media media = new Media(getClass().getResource("media/피고인.mp4").toString());

      // 오디오
      Media media = new Media(getClass().getResource("media/너무너무너무.mp3").toString());

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
            
            sliderMedia.setMin(0.0);
            sliderMedia.setValue(0.0);
            sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());
            
            /*
             * MediaPlayer의 현재시간을 속성감시를 한다. 시간이기에 제네릭타입은 Duration
             * 이다. 재생이 되면서 currentTime이 변경괴면, 그 값은 newvalue에 계속 들어가게된다.
             * 이 currentTime을 progressBar나 progressIndicator에 나타내기 위해서는
             * 0.0~1.0사이에 값으로 환산하여 나타내 줘야 한다
             */
         }
      });
      
      mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
         @Override
         public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,Duration newValue) {
            double progress=mediaPlayer.getCurrentTime().toSeconds()/
                  mediaPlayer.getTotalDuration().toSeconds();
            
            progressBar.setProgress(progress);
            progressIndicator.setProgress(progress);
            
            sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());
            
            labelTime.setText((int)mediaPlayer.getCurrentTime().toSeconds()+"/"+(int)mediaPlayer.getTotalDuration().toSeconds()+"초");
            sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());
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
         
         //강제적으로 1.0을 설정하여 완료상태가 ㅏㄴ오도록 하자.
         progressBar.setProgress(1.0);
         progressIndicator.setProgress(1.0);
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
      
      /*
       *sliderVolume이 변경되었을때 불륨의 크기를 조절하는 속성감시
       *dlider의 value의 범위는 0.0~100.0이다. 하지만, mediaPlayer의 value의 범위는
       *0.0~1.0이기 떄문에 100.0으로 나눈다. 
       */
      sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
         @Override
         public void changed(ObservableValue<? extends Number> observableValue,Number oldValue, Number newValue) {
            //mediaPlayer.setVolume(newValue.doubleValue()/100.0);
            //볼륨 조정값
            //가독성이 이 코드가 좋으므로 이것으 하자.
            mediaPlayer.setVolume(sliderVolume.getValue()/100.0);
         }
      });
      
      sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {
    	  @Override
    	public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
    		  if (sliderMedia.isValueChanging() || Math.abs(oldValue.doubleValue()-newValue.doubleValue())>0.5) {
       	       // multiply duration by percentage calculated by slider position
    			  mediaPlayer.seek(Duration.seconds(sliderMedia.getValue())); 
       	       }
    	}
	});
   }
}