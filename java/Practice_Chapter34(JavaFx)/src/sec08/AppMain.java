
package sec08;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		// Parent root=FXMLLoader.load(getClass().getResource("root.fxml"));
		/*
		 * FXMLLoader객체를 직접 생성해서 인스턴스 메서드인 load()를 통해 Stage를 만들고 아울러 컨트롤러의 참조를 얻어
		 * setter메서드를 호출함
		 */
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = loader.load();
		RootController rootController = loader.getController(); // RootController의 참조를 얻는다.
		// Setter의 매개값으로 primaryStage를 넘기면 RootController에서
		// 주윈도우의 참조를 얻을 수 있다.
		rootController.setPrimaryStage(primaryStage);
		Scene scene = new Scene(root);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

}
