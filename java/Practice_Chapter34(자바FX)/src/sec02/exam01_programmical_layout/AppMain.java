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
		 * 컨테이너 설정과 각종 컨트롤들을 자바코드로 만들어짐(
		 */
		HBox hbox = new HBox(); // 수평으로 컨트롤을 배치하는 HBox루트컨테이너를 새성
		hbox.setPadding(new Insets(30, 30, 30, 30)); //각 10픽셀씩 들여쓰기(시계방향)
		hbox.setSpacing(10); // 컨트롤간의 간격을 10픽셀로 설정
		// 글자를 입력할수 있는 TestField컨트롤 생성
		TextField textField = new TextField();

		Button button = new Button(); // 버튼 컨트롤 생성
		button.setText("확인");
		// 방법1
		// hbox.getChildren.add(textField); //hbox컨테이너에 textField컨트롤 배치
		// hbox.getChildren.add(button); //hbox컨테이너에 button컨트롤 배치
		// 방법2
		ObservableList list = hbox.getChildren(); // hbox컨테이너의 OPbservable을 얻기
		// Hbox컨테이너에 컨트로추가
		list.add(textField);
		list.add(button);
		// 화면의 루트컨테이너(Parent)를 PArent클래스를 상속받은 Hbox로 설정
		Scene scene = new Scene(hbox);
		primaryStage.setTitle("appMain"); // 윈도우 타이틀 설정
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
