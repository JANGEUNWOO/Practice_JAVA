package sec01.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

//Main은 항상 javaFx.application.Application(추상클래스)을 상속하여야 한다.
public class AppMain extends Application {

	// Application클래스의 start란 추상메서드를 재정의
	@Override
	public void start(Stage primaryStage) throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println("실행스레드:" + threadName);
		primaryStage.show(); //윈도우 창 생성
	}

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("실행스레드:" + threadName);
		// 자바FX어플리케이션 스레드를 생성하여 start()를 호출하여 준다.
		Application.launch(args);
	}

}
