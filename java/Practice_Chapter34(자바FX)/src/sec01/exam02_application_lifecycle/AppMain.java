package sec01.exam02_application_lifecycle;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println("생성자 호출");
		System.out.println("실행스레드:" + Thread.currentThread().getName());
	}
	// JAvaFX launcher 스레드가 실행함

	@Override
	public void init() throws Exception {
		// init()메서드 UI 생성 및 변경하는 코드가 절대로 오면 안됨 예외 발생한다.
		// init()문 주로 실행매개값을 JavaFX application스레드에 전달할 목적으로 사용되곤 한다.
		System.out.println("init()_실행");
		System.out.println("실행스레드:" + Thread.currentThread().getName());
	}
	// 실행스레드는 javaFx Application

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start()_실행");
		String threadName = Thread.currentThread().getName();
		System.out.println("실행스레드:" + threadName);
		primaryStage.show(); //윈도우 창 생성
	}
	
	
	@Override
	public void stop() throws Exception{
		//윈도우 정의 x표시를 클릭시 자동 실행
		//application의 종료시 수행해야할 코드들을 주로 작성한다
		System.out.println("stop()_실행");
	System.out.println("실행스레드:"+Thread.currentThread().getName());
	}
	
	//실행스레드는 메인스레드
	public static void main(String[] args) {
		System.out.println("main()_실행");
		System.out.println("실행스레드:" + Thread.currentThread().getName());
		// 자바FX어플리케이션 스레드를 생성하여 start()를 호출하여 준다.
		Application.launch(args);
	}

}
