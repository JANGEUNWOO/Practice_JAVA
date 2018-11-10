
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
		 * FXMLLoader��ü�� ���� �����ؼ� �ν��Ͻ� �޼����� load()�� ���� Stage�� ����� �ƿ﷯ ��Ʈ�ѷ��� ������ ���
		 * setter�޼��带 ȣ����
		 */
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = loader.load();
		RootController rootController = loader.getController(); // RootController�� ������ ��´�.
		// Setter�� �Ű������� primaryStage�� �ѱ�� RootController����
		// ���������� ������ ���� �� �ִ�.
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
