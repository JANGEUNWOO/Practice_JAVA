package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MemberController implements Initializable {

	MemberDAO md = new MemberDAO();

	@FXML
	private Label lblStatus;

	@FXML
	private TextField txtID;

	@FXML
	private TextField txtPassword;

	@FXML
	private Button btn1;

	@FXML
	private Button btn2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btn1.setOnAction(event -> handleFormLoginSuccess(event));
		btn2.setOnAction(event -> handleFormJoin(event));

	}

	public void handleFormLoginSuccess(ActionEvent event) {

		lblStatus.setStyle("-fx-text-fill:red;");
		String id = txtID.getText();
		String password = txtPassword.getText();
		System.out.println(id);
		System.out.println(password);
		System.out.println(md.selectOne(id).getPassword());

		if (id.equals("")) {
			lblStatus.setText("아이디를 입력하세요");
		} else if (password.equals("")) {
			lblStatus.setText("비밀번호를 입력하세요");
		} else if (!id.equals(id) || !(password.equals(md.selectOne(id).getPassword()))) {
			lblStatus.setText("아이디 또는 비밀번호를 확인하세요");
		} else {
			lblStatus.setStyle("-fx-text-fill:green;");
			lblStatus.setText("로그인이 되었습니다");

			try {
				((Node) (event.getSource())).getScene().getWindow().hide();
				Parent parent = FXMLLoader.load(getClass().getResource("main.fxml"));
				Stage stage = new Stage();
				Scene scene = new Scene(parent);
				stage.setScene(scene);
				stage.setTitle("Main Frame");
				stage.show();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}

	public void handleFormJoin(ActionEvent event) {

		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource("Join.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("join Form");
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
