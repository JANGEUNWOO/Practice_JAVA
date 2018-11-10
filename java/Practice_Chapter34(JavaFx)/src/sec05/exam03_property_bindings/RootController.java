package sec05.exam03_property_bindings;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {
	// root.fxml파일의 컨트롤의 속성을 참조함.
	@FXML
	private AnchorPane root;
	@FXML
	private Circle circle;
	
	//private TextField text;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//아래는 바인딩을 하는데 사용자가 맘대로 윈도우창을 크게 하거나 작게해도
		//AnchorPane의 폭과 높이를 2로 나눠서 circle의 x,y죄표로 바인딩을 해주는 단방향이다.
		//하여, 계속해서 중앙에 위치하게 되는 것이다.
		
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));
		
		

	}
}