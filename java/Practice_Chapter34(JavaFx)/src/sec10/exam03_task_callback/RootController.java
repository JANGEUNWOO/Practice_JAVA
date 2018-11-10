package sec10.exam03_task_callback;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable {

	// fxml 컨트롤 참조
	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label lblWorkDone;
	@FXML
	private Label lblResult;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;

	// Integer결과 값이 있는 Task를 마들기 위해 <Integer>타입 지정함.
	private Task<Integer> task;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 이벤트 처리부분
		// 익명구현객체
		btnStart.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleBtnStart(event);
			}
		});
		// 람다식
		btnStop.setOnAction(event -> handleBtnStop(event));
	}

	public void handleBtnStart(ActionEvent event) {
		// 결과값이 없는 Task생성, Task는 call()추상메서드를 가지고 있어
		// 재정의를 하여야 한다.(작업내용)
		task = new Task<Integer>() {
			@Override
			protected Integer call() throws Exception {

				int result = 0; // 결과값을 리턴할 임시변수

				for (int i = 0; i <= 100; i++) {
					// 취소가 되었는지 계속 감시함.
					if (this.isCancelled()) {
						this.updateMessage("취소됨");
						break;
					}

					result += i; // 누적
					// updateProgress()는 ProgressBar나 ProgressIndicator에만
					// 국한되어 있다.
					this.updateProgress(i, 100); // i는 진행값, 100은 완료값
					// 작업이 완료되면, i값을 lblWorkDone에 뿌려준다.
					this.updateMessage(String.valueOf(i));

					// call()에는 예외처리가 되어있다. 하지만, 지금은 외부에서
					// interrupt()를 호출하면 task가 취소되도록 직접 예외구문을
					// 넣었다.
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						if (this.isCancelled()) {
							this.updateMessage("취소됨");
							break;
						}
					}
				}
				return result;
			}

			// 성공했을때 자동실행하는 succeeded()재정의
			// 아래 3개의 메서드는 javaFx Application Thread가 실행하므로 얼마든지 UI변경코드를
			// 넣을 수 있다.
			@Override
			protected void succeeded() {
				System.out.println("성공" + Thread.currentThread().getName());
				lblResult.setText(String.valueOf(task.getValue())); // 결과값 UI변경
			}

			// 취소되었을 때 자동실행
			@Override
			protected void cancelled() {
				System.out.println("취소" + Thread.currentThread().getName());
				lblResult.setText("취소됨");
			}

			@Override
			protected void failed() {
				System.out.println("예외" + Thread.currentThread().getName());
				lblResult.setText("예외발생함");
			}
		};
		 //속성바이딩 코드
	      //ProgressBar컨트롤의 속성과 task의 updateProgress의 progress속성과
	      //바인딩한다.
	      //이렇게 해주면 ProgressBar의 진행정도의 값이 변하게 된다.
	      //왜냐하면, task의 i값이 계속 변하기 때문이다.
	      progressBar.progressProperty().bind(task.progressProperty());
	      //위와 같이 Label컨트롤의 속성과 updateMessage()의 속성을 바인딩시킨다.
	      lblWorkDone.textProperty().bind(task.messageProperty());
	      
	      //스레드 생성, 매개값으로 task를 주었다.
	      //앞서 언급했지만 Task는 Runnable인터페이스를 구현했기 때문에 매개값으로
	      //들어갈수가 있는 것이다.
	      Thread thread = new Thread(task);
	      thread.setDaemon(true);
	      thread.start();

	}

	public void handleBtnStop(ActionEvent event) {
		// '멈춤'버튼을 클릭하면 task를 취소메서드인 cancel()을 호출하며,
		// task를 취소시킨다.
		task.cancel();
	}

}
