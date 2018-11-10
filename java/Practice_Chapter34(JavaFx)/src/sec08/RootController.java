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

   //fx:id ����
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
      // getExtensionFilter()�� ����Ȯ����� �������� ���͸��� ���ִ� �޼����̸�,
      // �ƿ﷯ �Ű����� ExtensionFilterŬ������ ������.
      filechooser.getExtensionFilters().addAll(
            // ���͸��� ���� : txt files, ���͸� ���� : txt
            new ExtensionFilter("Txt Files(*.txt)", "*.txt"),
            // ���͸��� ���� : Image files, ���͸� ���� : jpg, gif, png
            new ExtensionFilter("Image Files(*.png, *.jpg, *.gif)", "*.png", "*.jpg", "*.gif"),
            // ���͸��� ���� : Audio files, ���͸� ���� : mp3, wav, aac
            new ExtensionFilter("Audio Files(*.mp3, *.wav, *.aac)", "*.mp3", "*.wav", "*.aac"),
            // ���͸��� ���� : All files, ���͸� ���� : *.*
            new ExtensionFilter("All Files(*.*)", "*.*")
            );
      
      //ù ��° ������� primarystage�� ������ ��� ���̴�.
      File selectedFile = filechooser.showOpenDialog(primaryStage);
      
         /*showOpenDialog()�� ����ڰ� ���� ��ư�� ������ ��, �� ������ ������ ���´�.
         ��, ��ҳ� X��ư�� ������ ���� null���� �Ѱ�����.
         showOpenDialog()�� �Ű����� ������ ������(primaryStage)�ε�, ���⼭�� 2��° �������
         �����̳ʸ� ���� ������ ���������� ������ ���� ����̴�.
         ���� ShowSaveDialog()�� �����Ҷ� ���� FileChooser�̴�.*/
      //File selectedFile = fileChooser.showOpenDialog(hbox.getScene().getWindow());
      
      // ���õ� ������ ���� �����Ͽ� ó���� ���ش�.
      if(selectedFile != null) {
         System.out.println("�������� ��� : " + selectedFile.getPath());
      }
   }
   
   // showSaveFileDialog
   public void handleSaveFileChooser(ActionEvent event) {
      FileChooser fileChooser = new FileChooser();
      fileChooser.getExtensionFilters().addAll(
            new ExtensionFilter("All Files(*.*)", "*.*"));
      
      // ù��° ������� primaryStage�� ������ ��´�.
      File selectedFile = fileChooser.showSaveDialog(primaryStage);
      // ���õ� ������ ���� �����Ͽ� ó���� ���ش�.
      if(selectedFile != null) {
         System.out.println("����� ���� ��� : " + selectedFile.getPath());
      }
   }
   
   public void handleOpenDirectoryChooser(ActionEvent event) {
      DirectoryChooser directoryChooser = new DirectoryChooser();
      // ù��° ������� primaryStage�� ������ ��´�.
      File selectedFile = directoryChooser.showDialog(primaryStage);
      // ���õ� ���丮�� ���� �����Ͽ� ó���� ���ش�.
      if(selectedFile != null) {
         System.out.println("���õ� ���丮 ��� : " + selectedFile.getPath());
      }
   }
   
   // Popup�κ�
   public void handlePopup(ActionEvent event) throws Exception {
      //Popup��ü ����
      Popup popup = new Popup();
      // fxml���Ϸ� �ۼ� �� load�Ѵ�.
      Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
      // ------------------------------------- �˾��� ���� ---------------------------------------------
         /*lookup()�� �Ű������� fxml������ id���̴�. �� imageview�� ã�� ���̴�.
         ���ϰ��� node�̹Ƿ� ����Ÿ�� ��ȯ�Ͽ� Imageview�� ������ �ȴ�.
         Imageview�� Node�� ��ӹޱ� ������ �����ϴ�. #�� id�� ������ �ִ� ��ü�� �����϶�� ���̴�.
         �ñ������� �̷��� �ϴ� ������ �ڹ��ڵ忡�� �������� �̹����� ������ �ֱ� �����̴�.*/
      ImageView imageView = (ImageView)parent.lookup("#imgMessage");
      imageView.setImage(new Image(getClass().getResource("icon/dialog-info.png").toString()));
      // imageView�� Ŭ���� �����ϴ� �̺�Ʈ �κ�
      imageView.setOnMouseClicked(e -> popup.hide());
      // Label ���� lookup()�� �̿��ؼ� �������� Label�� �ؽ�Ʈ�� ������ ���� �ִ�.
      Label lblMessage = (Label)parent.lookup("#lblMessage");
      lblMessage.setText("�޽����� �Խ��ϴ�.");
      //popupâ�� fxml������ ������ �߰��Ѵ�.
      popup.getContent().add(parent);
      //popupâ�� ���콺�� ��Ŀ���� �ٸ� ������� ���� �ڵ����� �����Բ� ��.
      popup.setAutoHide(true);
      popup.show(primaryStage);
   }
   
   // ����� ���� ���̾�α� �κ�(custom_dialog)
   public void handleCustom(ActionEvent event) throws Exception {
      // ������ ����̰� ����� �ݱ� ��ư�� �ִ� Stage����
      Stage dialog = new Stage(StageStyle.UTILITY);
      //dialog�� ���(������ ������ ���Ұ�)�� ����
      dialog.initModality(Modality.WINDOW_MODAL);
      dialog.initOwner(primaryStage);
      dialog.setTitle("Ȯ��");
      
      //dialog ���� �ε�
      Parent parent = (Parent)FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
      // fxml���Ͽ� �ִ� Label��Ʈ���� ������ ��� �������� �޽��� �ۼ�
      Label txtTitle = (Label)parent.lookup("#txtTitle");
      txtTitle.setText("Ȯ���ϼ̽��ϱ�?");

      // Button ���� ���� ���� FXML���� ������ �ް�, �̺�Ʈ ó������ ��.
      Button btnOk = (Button)parent.lookup("#btnOk");
      btnOk.setOnAction(e -> dialog.close()); // Ȯ���� ��������, ������ â ����.
      
      // ���̾�α׿��� x��ư�� ��������
      dialog.setOnCloseRequest(e -> System.out.println("���̾�α� ���� Ŭ��"));
      
      Scene scene = new Scene(parent);    // Scene����
      dialog.setScene(scene);            // Scene����
      dialog.setResizable(false);         // ����ڰ� ũ�������� ���� ���ϰ� ��.
      dialog.show();
   }
}
