package sec06.exam02;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {

	@FXML
	private TextField txtTitle;
	@FXML
	private PasswordField txtPassword;
	// CheckBox(���߼���)�� üũ�ʿ� ���� �������� �� ImageView
	@FXML
	private ComboBox<String> comboPublic;
	@FXML
	private DatePicker dateExit; // RadioButton�� ���� ToggleGroup
	// RadioButton(���ϼ���)�� �Ӽ����ÿ� ���� �̹����� ��Ÿ���� �� ImageView
	@FXML
	private TextArea txtContent;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void handleChkAction(ActionEvent event) {
		String title = txtTitle.getText();
		System.out.println("����:" + title);

		String password = txtPassword.getText();
		System.out.println("��й�ȣ:" + password);

		String strPublic = comboPublic.getValue();
		if (strPublic != null) {
			System.out.println("���� ����:" + strPublic);
		}
		// DataPicker�� ����ڷκ��� ������ ������ �Ǿ������ �װ���
		// LocalDate�� ������ �Ѵ�. ������. �ƹ������� ���� ���פ��ٸ� null��
		// ���ϵǾ����Ƿ� ���Ἲ �˻縦 �ؾ��Ѵ�.
		LocalDate localDate = dateExit.getValue();
		if (localDate != null) {
			System.out.println("�Խ� ������:" + localDate.toString());

		}
		String content = txtContent.getText();
		System.out.println("����:" + content);
	}

	// ���ø����̼� ����
	public void handleBtnExitAction(ActionEvent event) {

		Platform.exit();

	}

}