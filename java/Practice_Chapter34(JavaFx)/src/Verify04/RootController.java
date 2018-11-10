package Verify04;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	// root.fxml파일의 컨트롤의 속성을 참조함.
	@FXML
	private TextArea textArea1;
	@FXML
	private TextArea textArea2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Bindings클래스를 이용한 바인드.
		// 즉, 양쪽다 서로의 컨트롤에 영향을 주는 형태
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());

		// 아해와 같이 해도 되지만, Bindings클래스의 정적메서드를 이용하면 편리하다.
		// textArea2.textProperty().bindBidirectional(textArea1.textProperty());

	}
}