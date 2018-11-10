package Verify03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController {

	private String operator = "";
	private int x = 0;
	private Model model = new Model();

	@FXML
	private TextField textfield;

	@FXML
	private void operand(ActionEvent event) {
		textfield.setText(textfield.getText() + ((Button) event.getSource()).getText());
	}

	@FXML
	private void operator(ActionEvent event) {
		if (((Button) event.getSource()).getText().equals("=")) {
			textfield.setText(model.calculator(operator, x, Integer.parseInt(textfield.getText())) + "");

		} else {
			operator=((Button) event.getSource()).getText();
			x=Integer.parseInt(textfield.getText());
			textfield.setText("");
		}
	}

}
