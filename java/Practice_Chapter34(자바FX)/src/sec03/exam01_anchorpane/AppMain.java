package sec03.exam01_anchorpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox hbox = new HBox();
		Button button = new Button();
		button.setPrefSize(100, 100);
		HBox.setMargin(button, new Insets(20, 20, 50, 50));

		hbox.getChildren().add(button);
		Scene scene = new Scene(hbox);
		primaryStage.setTitle("anchorpane");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] ag) {
		launch(ag);

	}

}
