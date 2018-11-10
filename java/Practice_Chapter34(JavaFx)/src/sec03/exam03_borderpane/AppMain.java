package sec03.exam03_borderpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// BorderPane으로 만들어진 root.fxml파일을 로딩한다.
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);

		primaryStage.setTitle("BorderPaneExample");
		/*
		 * 아래와 같이 primaryStage의 크기, 즉 윈도우의 크기를 미리 설정하고 fxml파일의 루트컨텔이너의 크기를 아무리 설정해봐야
		 * 윈도우창이 미리 크기가 정해져 있기 때문에 의미가 없어지게 된다. 하여, 사용자는 윈도우창을 기준으로 하여 크기를 설정할 것인지 아니면
		 * 루트컨테이너를 기준으로 fxml파일에서 크기를 설정할 것인지를 정해서 코딩하는 것이 바람직하다.
		 */
		// primaryStage.setWidth(500);
		// primaryStage.setHeigt(500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
