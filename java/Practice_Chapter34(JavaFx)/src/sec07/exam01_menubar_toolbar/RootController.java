package sec07.exam01_menubar_toolbar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML
	TextArea textArea;
	@FXML
	ComboBox<String> comboBox;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void handleNew(ActionEvent event) {
		textArea.appendText("���θ����\n");

	}

	public void handleOpen(ActionEvent event) {
		textArea.appendText("����\n");
	}

	public void handleSave(ActionEvent event) {
		textArea.appendText("����\n");
	}

	public void handleExit(ActionEvent event) {
		textArea.appendText("������\n");
		Platform.exit();
	}

	public void handleCombo(ActionEvent event) {

		if (comboBox.getValue().equals("����")) {
			textArea.appendText("����\n");
		} else if (comboBox.getValue().equals("�����")) {
			textArea.appendText("�����\n");
		}
	}

}
