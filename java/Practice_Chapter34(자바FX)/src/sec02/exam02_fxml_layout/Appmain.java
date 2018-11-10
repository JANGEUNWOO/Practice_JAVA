package sec02.exam02_fxml_layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Appmain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		/*
		 * FXML�� �̿��� ���̾ƿ� ��ġ��. �ڹ��ڵ�� ���� �и��� ������ �ڹ���Ʈ�� �ͼ��ϰ�����, �ܼ��� �κ��̸� ����� ������ ������
		 * ���̾ƿ��̶�� ���? �ڹ��ڵ�� �̷���� ���� �ſ� �����ϰ� �ڵ带 �����ϱ� ��ƴ�. ������, FXML���Ϸ� ���̾ƿ��� �����, �±�
		 * �ۼ��� ������� �ͼ������� �ڵ� �ľ��� �ſ� ���� �ƿ﷯ �ڹ��ڵ� ������ �ǵ� �ʿ䰡 ���� �����̳ʿ� ������ �ſ� ���� �ȴ�. ��ټ���
		 * ���������� �̷��� �̷�����Դ�.
		 */

		// root.fxml�� �ۼ��� ���� parent ��, �����̳ʿ� ��Ʈ���� �����ض�
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Appmain");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
