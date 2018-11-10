package sec10.exam02_task;

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

public class RootController implements Initializable{
   //fxml 컨트롤 참조.
   @FXML private ProgressBar progressBar;
   @FXML private Label lBlWorkDone;
   @FXML private Button btnStart;
   @FXML private Button btnStop;
   
   // 결과 괎이 없는 Task를 만들기 위해 <Void>타입 지정함.
   private Task<Void> task;
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
      //람다식
      btnStop.setOnAction(event -> handleBtnStop(event));
   }
   //이벤트 처리 메서드
   public void handleBtnStart(ActionEvent event) {
      //결과값이 없는 Task생성, Task는 call()추상메서드를 가지고 있어
      //재정의를 하여야 한다.(작업내용)
      task = new Task<Void>() {
         @Override
         protected Void call() throws Exception{
            for(int i=0; i<=100; i++) {
               //취소가 되었는지 계속 감시함.
               if(this.isCancelled()) {
                  this.updateMessage("취소됨");
                  break;
               }
               //updateProgress()는 ProgressBar나 ProgressIndicator에만
               //국한되어 있다.
               this.updateProgress(i, 100); //i는 진행값, 100은 완료값
               //작업이 완료되면, i값을 lblWorkDone에 뿌려준다.
               this.updateMessage(String.valueOf(i));
               
               //call()에는 예외처리가 되어있다. 하지만, 지금은 외부에서
               //interrupt()를 호출하면 task가 취소되도록 직접 예외구문을
               //넣었다.
               try {
                  Thread.sleep(100);
               } catch(InterruptedException e) {
                  if(this.isCancelled()) {
                     this.updateMessage("취소됨");
                     break;
                  }
               }
            }
            return null;
         }
      };
      //속성바이딩 코드
      //ProgressBar컨트롤의 속성과 task의 updateProgress의 progress속성과
      //바인딩한다.
      //이렇게 해주면 ProgressBar의 진행정도의 값이 변하게 된다.
      //왜냐하면, task의 i값이 계속 변하기 때문이다.
      progressBar.progressProperty().bind(task.progressProperty());
      //위와 같이 Label컨트롤의 속성과 updateMessage()의 속성을 바인딩시킨다.
      lBlWorkDone.textProperty().bind(task.messageProperty());
      
      //스레드 생성, 매개값으로 task를 주었다.
      //앞서 언급했지만 Task는 Runnable인터페이스를 구현했기 때문에 매개값으로
      //들어갈수가 있는 것이다.
      Thread thread = new Thread(task);
      thread.setDaemon(true);
      thread.start();
   }
   //이벤트 처리 메서드
   public void handleBtnStop(ActionEvent event) {
      //'멈춤'버튼을 클릭하면 task를 취소메서드인 cancel()을 호출하며,
      //task를 취소시킨다.
      task.cancel();
   }

}
