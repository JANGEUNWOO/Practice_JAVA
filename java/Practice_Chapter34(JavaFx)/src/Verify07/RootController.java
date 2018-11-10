package Verify07;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class RootController implements Initializable {
	 @FXML
	   MediaView mediaView;
	   private Stage primaryStage;

	   public void setPrimaryStage(Stage primaryStage) {
	      this.primaryStage = primaryStage;
	   }

	   @Override
	   public void initialize(URL location, ResourceBundle resources) {

	   }

	   public void handleOpen(ActionEvent event) {
	      FileChooser filechooser = new FileChooser();

	      filechooser.getExtensionFilters().addAll(

	            new ExtensionFilter("Audio Files(*.mp3, *.wav, *.aac)", "*.mp3", "*.wav", "*.aac"),

	            new ExtensionFilter("All Files(*.*)", "*.*"));

	      File selectedFile = filechooser.showOpenDialog(primaryStage);

	      if (selectedFile != null) {
	         System.out.println("선택파일 경로 : " + selectedFile.getPath());
	      }

	      Media media = new Media(selectedFile.toURI().toString());

	      MediaPlayer mediaPlayer = new MediaPlayer(media);

	      mediaPlayer.play();

	      mediaView.setMediaPlayer(mediaPlayer);
	   }
	}