package sec03.exam03_borderpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// BorderPane���� ������� root.fxml������ �ε��Ѵ�.
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);

		primaryStage.setTitle("BorderPaneExample");
		/*
		 * �Ʒ��� ���� primaryStage�� ũ��, �� �������� ũ�⸦ �̸� �����ϰ� fxml������ ��Ʈ�����̳��� ũ�⸦ �ƹ��� �����غ���
		 * ������â�� �̸� ũ�Ⱑ ������ �ֱ� ������ �ǹ̰� �������� �ȴ�. �Ͽ�, ����ڴ� ������â�� �������� �Ͽ� ũ�⸦ ������ ������ �ƴϸ�
		 * ��Ʈ�����̳ʸ� �������� fxml���Ͽ��� ũ�⸦ ������ �������� ���ؼ� �ڵ��ϴ� ���� �ٶ����ϴ�.
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
