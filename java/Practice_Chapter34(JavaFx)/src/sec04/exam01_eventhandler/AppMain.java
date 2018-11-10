package sec04.exam01_eventhandler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		HBox root = new HBox();
		root.setPrefSize(200, 50);
		root.setSpacing(20);

		Button btn1 = new Button();
		btn1.setText("버튼1");
		Button btn2 = new Button();
		btn2.setText("버튼2");

		// root.getChildren().add(btn1);
		// root.getChildren().add(btn2);
		// 위와 같이 해도 되지만 addAll메서드를 이용해서 한번에 추가해도 된다.
		root.getChildren().addAll(btn1, btn2);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();

		// 이벤트 처리부분 등록
		/*
		 * 버튼에서 Action이벤트가 발생하면, 이를 처리해줄 핸들러를 버튼에 등록을 해준다. 이것을 위임현 방식이라고 한다. 그럼 이
		 * EventHandler는 제네릭인터페이스이면서 아울러 함수적인인터페이스다. 즉, handle()메서드를 하나만 가지고 있다. 하여 이
		 * handle()메서드를 구현해주면 버튼에서 이벤트가 발생하면 그것을 handle() 내에 있는 코드가 실행되는 것.
		 */

		/*
		 * btn1.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) {
		 * System.out.println("버튼1 클릭했음."); } });
		 */

		// 람다식으로 작성하니 휠 코드가 많이 줄어진 것을 알수가 있다.
		btn1.setOnAction(event -> System.out.println("람다식으로 구현되어진 버튼1 클릭"));

		/*
		 * btn2.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) {
		 * System.out.println("버튼2 클릭했음."); } });
		 */

		btn2.setOnAction(event -> System.out.println("람다식으로 구현되어진 버튼2 클릭"));

		// 윈도우창의 x버튼을 눌렀을 때 이벤트 처리
		primaryStage.setOnCloseRequest(event -> System.out.println("윈도우창의 종료 클릭"));

	}

	public static void main(String[] args) {
		launch(args);
	}
}
