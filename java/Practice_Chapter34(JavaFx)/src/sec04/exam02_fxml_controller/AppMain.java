package sec04.exam02_fxml_controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start�޼���ȣ��");
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.show();
		// �����(���ٽ�)
		primaryStage.setOnCloseRequest(event -> System.out.println("����Ŭ��"));

	}

	public static void main(String[] args) {
		launch(args);
	}
}