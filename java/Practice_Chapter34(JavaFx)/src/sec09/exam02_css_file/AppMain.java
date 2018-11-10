package sec09.exam02_css_file;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);

		//외부에서 작성한 CSS파일을 scene에 적용한다.
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		//primaryStage.setOncloseRequest(event->System.out.println("종료클릭"));
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

}
