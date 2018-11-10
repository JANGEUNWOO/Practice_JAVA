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

   private boolean endOfMedia; // �÷��� ����

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      // ����� �ҽ�(Media)�� ������
      // ������
      // Media media = new Media(getClass().getResource("media/video.m4v").toString());
      // Media media = new Media(getClass().getResource("media/�ǰ���.mp4").toString());

      // �����
      Media media = new Media(getClass().getResource("media/�ʹ��ʹ��ʹ�.mp3").toString());

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
            
            sliderMedia.setMin(0.0);
            sliderMedia.setValue(0.0);
            sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());
            
            /*
             * MediaPlayer�� ����ð��� �Ӽ����ø� �Ѵ�. �ð��̱⿡ ���׸�Ÿ���� Duration
             * �̴�. ����� �Ǹ鼭 currentTime�� ���汫��, �� ���� newvalue�� ��� ���Եȴ�.
             * �� currentTime�� progressBar�� progressIndicator�� ��Ÿ���� ���ؼ���
             * 0.0~1.0���̿� ������ ȯ���Ͽ� ��Ÿ�� ��� �Ѵ�
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
            
            labelTime.setText((int)mediaPlayer.getCurrentTime().toSeconds()+"/"+(int)mediaPlayer.getTotalDuration().toSeconds()+"��");
            sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());
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
         
         //���������� 1.0�� �����Ͽ� �Ϸ���°� ���������� ����.
         progressBar.setProgress(1.0);
         progressIndicator.setProgress(1.0);
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
      
      /*
       *sliderVolume�� ����Ǿ����� �ҷ��� ũ�⸦ �����ϴ� �Ӽ�����
       *dlider�� value�� ������ 0.0~100.0�̴�. ������, mediaPlayer�� value�� ������
       *0.0~1.0�̱� ������ 100.0���� ������. 
       */
      sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
         @Override
         public void changed(ObservableValue<? extends Number> observableValue,Number oldValue, Number newValue) {
            //mediaPlayer.setVolume(newValue.doubleValue()/100.0);
            //���� ������
            //�������� �� �ڵ尡 �����Ƿ� �̰��� ����.
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