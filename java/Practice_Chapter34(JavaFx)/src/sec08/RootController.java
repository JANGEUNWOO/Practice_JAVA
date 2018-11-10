package sec08;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {

   //fx:id 참조
   //@FXML HBox hbox;
   private Stage primaryStage;

   // primaryStage setter
   public void setPrimaryStage(Stage primaryStage) {
      this.primaryStage = primaryStage;
   }

   @Override
   public void initialize(URL location, ResourceBundle resources) {      
   }
   
   //showOpenFileDialog
   public void handleOpenFileChooser(ActionEvent event) {
      
      FileChooser filechooser = new FileChooser();
      // getExtensionFilter()는 파일확장명을 기준으로 필터링을 해주는 메서드이며,
      // 아울러 매개값을 ExtensionFilter클래스를 가진다.
      filechooser.getExtensionFilters().addAll(
            // 필터링의 제목 : txt files, 필터링 형식 : txt
            new ExtensionFilter("Txt Files(*.txt)", "*.txt"),
            // 필터링의 제목 : Image files, 필터링 형식 : jpg, gif, png
            new ExtensionFilter("Image Files(*.png, *.jpg, *.gif)", "*.png", "*.jpg", "*.gif"),
            // 필터링의 제목 : Audio files, 필터링 형식 : mp3, wav, aac
            new ExtensionFilter("Audio Files(*.mp3, *.wav, *.aac)", "*.mp3", "*.wav", "*.aac"),
            // 필터링의 제목 : All files, 필터링 형식 : *.*
            new ExtensionFilter("All Files(*.*)", "*.*")
            );
      
      //첫 번째 방법으로 primarystage의 참조를 얻는 것이다.
      File selectedFile = filechooser.showOpenDialog(primaryStage);
      
         /*showOpenDialog()는 사용자가 열기 버튼을 눌렀을 때, 그 파일의 참조를 얻어온다.
         단, 취소나 X버튼을 눌렀을 때는 null값이 넘겨진다.
         showOpenDialog()의 매개값은 소유자 윈도우(primaryStage)인데, 여기서는 2번째 방법으로
         컨테이너를 통한 참조로 주윈도우의 참조를 얻은 방법이다.
         참고 ShowSaveDialog()는 저장할때 띄우는 FileChooser이다.*/
      //File selectedFile = fileChooser.showOpenDialog(hbox.getScene().getWindow());
      
      // 선택된 파일의 값을 조사하여 처리를 해준다.
      if(selectedFile != null) {
         System.out.println("선택파일 경로 : " + selectedFile.getPath());
      }
   }
   
   // showSaveFileDialog
   public void handleSaveFileChooser(ActionEvent event) {
      FileChooser fileChooser = new FileChooser();
      fileChooser.getExtensionFilters().addAll(
            new ExtensionFilter("All Files(*.*)", "*.*"));
      
      // 첫번째 방법으로 primaryStage의 참조를 얻는다.
      File selectedFile = fileChooser.showSaveDialog(primaryStage);
      // 선택된 파일의 값을 조사하여 처리를 해준다.
      if(selectedFile != null) {
         System.out.println("저장된 파일 경로 : " + selectedFile.getPath());
      }
   }
   
   public void handleOpenDirectoryChooser(ActionEvent event) {
      DirectoryChooser directoryChooser = new DirectoryChooser();
      // 첫번째 방법으로 primaryStage의 참조를 얻는다.
      File selectedFile = directoryChooser.showDialog(primaryStage);
      // 선택된 디렉토리의 값을 조사하여 처리를 해준다.
      if(selectedFile != null) {
         System.out.println("선택된 디렉토리 경로 : " + selectedFile.getPath());
      }
   }
   
   // Popup부분
   public void handlePopup(ActionEvent event) throws Exception {
      //Popup객체 생성
      Popup popup = new Popup();
      // fxml파일로 작성 후 load한다.
      Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
      // ------------------------------------- 팝업의 내용 ---------------------------------------------
         /*lookup()의 매개변수가 fxml파일의 id값이다. 즉 imageview를 찾는 것이다.
         리턴값이 node이므로 강제타입 변환하여 Imageview로 받으면 된다.
         Imageview는 Node를 상속받기 때문에 가능하다. #은 id를 가지고 있는 객체를 참조하라는 것이다.
         궁극적으로 이렇게 하는 이유는 자바코드에서 동적으로 이미지를 설정해 주기 위함이다.*/
      ImageView imageView = (ImageView)parent.lookup("#imgMessage");
      imageView.setImage(new Image(getClass().getResource("icon/dialog-info.png").toString()));
      // imageView를 클릭시 종료하는 이벤트 부분
      imageView.setOnMouseClicked(e -> popup.hide());
      // Label 역시 lookup()를 이용해서 동적으로 Label의 텍스트를 설정할 수가 있다.
      Label lblMessage = (Label)parent.lookup("#lblMessage");
      lblMessage.setText("메시지가 왔습니다.");
      //popup창에 fxml파일의 내용을 추가한다.
      popup.getContent().add(parent);
      //popup창이 마우스의 포커스가 다른 윈도우로 가면 자동으로 닫히게끔 함.
      popup.setAutoHide(true);
      popup.show(primaryStage);
   }
   
   // 사용자 정의 다이얼로그 부분(custom_dialog)
   public void handleCustom(ActionEvent event) throws Exception {
      // 바탕이 흰색이고 제목과 닫기 버튼이 있는 Stage생성
      Stage dialog = new Stage(StageStyle.UTILITY);
      //dialog를 모달(소유자 윈도우 사용불가)로 설정
      dialog.initModality(Modality.WINDOW_MODAL);
      dialog.initOwner(primaryStage);
      dialog.setTitle("확인");
      
      //dialog 내용 로드
      Parent parent = (Parent)FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
      // fxml파일에 있는 Label컨트롤을 참조를 얻어 동적으로 메시지 작성
      Label txtTitle = (Label)parent.lookup("#txtTitle");
      txtTitle.setText("확인하셨습니까?");

      // Button 역시 위와 같이 FXML에서 참조를 받고, 이벤트 처리까지 함.
      Button btnOk = (Button)parent.lookup("#btnOk");
      btnOk.setOnAction(e -> dialog.close()); // 확인을 눌렀을때, 윈도우 창 닫힘.
      
      // 다이얼로그에서 x버튼을 눌렀을때
      dialog.setOnCloseRequest(e -> System.out.println("다이얼로그 종료 클릭"));
      
      Scene scene = new Scene(parent);    // Scene생성
      dialog.setScene(scene);            // Scene설정
      dialog.setResizable(false);         // 사용자가 크기조절을 하지 못하게 함.
      dialog.show();
   }
}
