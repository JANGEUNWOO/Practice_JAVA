package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class JoinController implements Initializable {

	@FXML
	private TextField id_tf;
	@FXML
	private PasswordField password_tf;
	@FXML
	private TextField name_tf;
	@FXML
	private TextField address_tf;
	@FXML
	private TextField phone_tf;

	@FXML
	private Button btnOk;
	@FXML
	private Button btnCancel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		btnOk.setOnAction(event -> handleFormOK(event));
	}

	public void handleFormOK(ActionEvent event) {


		MemberDAO mmd = new MemberDAO();
		mmd.insertMember(new Member(id_tf.getText(), password_tf.getText(), 
				name_tf.getText(), address_tf.getText(), phone_tf.getText()));


	}
	

}
