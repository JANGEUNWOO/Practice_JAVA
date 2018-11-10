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
		textArea.appendText("새로만들기\n");

	}

	public void handleOpen(ActionEvent event) {
		textArea.appendText("열기\n");
	}

	public void handleSave(ActionEvent event) {
		textArea.appendText("저장\n");
	}

	public void handleExit(ActionEvent event) {
		textArea.appendText("끝내기\n");
		Platform.exit();
	}

	public void handleCombo(ActionEvent event) {

		if (comboBox.getValue().equals("공개")) {
			textArea.appendText("공개\n");
		} else if (comboBox.getValue().equals("비공개")) {
			textArea.appendText("비공개\n");
		}
	}

}
