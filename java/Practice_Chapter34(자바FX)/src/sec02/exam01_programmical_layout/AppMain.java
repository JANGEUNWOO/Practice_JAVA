package sec02.exam01_programmical_layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		/*
		 * �����̳� ������ ���� ��Ʈ�ѵ��� �ڹ��ڵ�� �������(
		 */
		HBox hbox = new HBox(); // �������� ��Ʈ���� ��ġ�ϴ� HBox��Ʈ�����̳ʸ� ����
		hbox.setPadding(new Insets(30, 30, 30, 30)); //�� 10�ȼ��� �鿩����(�ð����)
		hbox.setSpacing(10); // ��Ʈ�Ѱ��� ������ 10�ȼ��� ����
		// ���ڸ� �Է��Ҽ� �ִ� TestField��Ʈ�� ����
		TextField textField = new TextField();

		Button button = new Button(); // ��ư ��Ʈ�� ����
		button.setText("Ȯ��");
		// ���1
		// hbox.getChildren.add(textField); //hbox�����̳ʿ� textField��Ʈ�� ��ġ
		// hbox.getChildren.add(button); //hbox�����̳ʿ� button��Ʈ�� ��ġ
		// ���2
		ObservableList list = hbox.getChildren(); // hbox�����̳��� OPbservable�� ���
		// Hbox�����̳ʿ� ��Ʈ���߰�
		list.add(textField);
		list.add(button);
		// ȭ���� ��Ʈ�����̳�(Parent)�� PArentŬ������ ��ӹ��� Hbox�� ����
		Scene scene = new Scene(hbox);
		primaryStage.setTitle("appMain"); // ������ Ÿ��Ʋ ����
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
