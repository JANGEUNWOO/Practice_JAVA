package Verify09;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RootController implements Initializable {

	@FXML
	private Button btnadd;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btnadd.setOnAction(event->handleFormStart(event));

	}

	public void handleFormStart(ActionEvent event) {
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("form.fxml"));
			//StackPane root = (StackPane) btnadd.getScene().getRoot();
			Stage stage=new Stage();
			Scene scene=new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("AppMain");
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
