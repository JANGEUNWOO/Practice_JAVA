package application;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BasicMainController implements Initializable {

	@FXML
	private Button chat_exe;

	@FXML
	private Button server_exe;

	@FXML
	private Label username;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		MemberDAO md = new MemberDAO();
		username.setText(md.login(LoginController.ID, LoginController.PASSWORD) + "�� �ȳ��ϼ���");

		chat_exe.setOnAction(event -> {
			try {
				Chatopen(event);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		server_exe.setOnAction(event -> {
			try {
				Serveropen(event);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

	}
	
	private void Serveropen(ActionEvent event) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("start�޼��� ȣ��");
		Parent parent=FXMLLoader.load(getClass().getResource("root.fxml"));
		Stage stage=new Stage();
		Scene scene=new Scene(parent);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		stage.setTitle("[ä�ü���]");
		stage.setScene(scene);
		stage.show();
		Cm cm=new Cm();
		
		stage.setOnCloseRequest(e->cm.stopServer());

		//�����(���ٽ�)
		stage.setOnCloseRequest(e->System.out.println("����Ŭ��"));

	}

	public void Chatopen(ActionEvent event) throws Exception {
		// ((Node) (event.getSource())).getScene().getWindow().hide();
		Parent parent = FXMLLoader.load(getClass().getResource("ChatRoot.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		scene.getStylesheets().add(getClass().getResource("ChatCSS.css").toString());

		stage.setScene(scene);
		stage.setTitle("Main Frame");
		stage.show();
	}

}
