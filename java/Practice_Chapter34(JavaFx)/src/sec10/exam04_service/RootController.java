package sec10.exam04_service;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Button;

public class RootController implements Initializable{

   
   @FXML private Label lblWorkDone;
   @FXML private ProgressBar progressBar;
   @FXML private Button btnStart;
   @FXML private Label lblResult;
   @FXML private Button btnStop;

   private TimeService timeService;
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
      
      //익명구현 객체
      btnStart.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
            handleBtnStart(event);
         }
      });
      
      // 람다식
      btnStop.setOnAction(event -> handleBtnStop(event));
      
      timeService = new TimeService();
      //프로그램 시작시 바로 실행하게끔 했다.
      // start()나 restart()가 호출되면 자동으로 createTask()를 호출한다!!
      timeService.start();
   }
   
   
   public void handleBtnStart(ActionEvent e) {
      timeService.restart();
      lblResult.setText("");
   }
   
   public void handleBtnStop(ActionEvent e) {
      timeService.cancel();
   }
   
   // 중첩클래스 TimeService
   class TimeService extends Service<Integer>{
      //Service클래스의 createTask()재정의
      @Override
      protected Task<Integer> createTask() {
         //Service에 사용됨 TAsk객체 만듬
         Task<Integer> task = new Task<Integer>() {
            @Override
            protected Integer call() throws Exception {
               int result = 0;
               for(int i=0; i<=100;i++) {
                  if(this.isCancelled()) {
                     break;
                  }
                  result +=i;
                  
                  //ProgressBar갱신
                  updateProgress(i, 100);
                  //Label 갱신
                  updateMessage(String.valueOf(i)+" %");
                  
                  try{
                     Thread.sleep(100);
                  } catch(InterruptedException e) {
                     if(this.isCancelled()) {
                        break;
                     }
                  }
               }
               return result;
            }
         };
         
         progressBar.progressProperty().bind(task.progressProperty());
         lblWorkDone.textProperty().bind(task.messageProperty());
         return task;
      }
      
      //Service객체의 아래 3개의 콜백 메서드를 재정의 한다.
      // 이 메서드들은 javafx 애플리케이션 스레드가 실행하므로 ui변경코드를 허용
      // 성공시 자동실행
      
      @Override
      protected void succeeded() {
         lblResult.setText(String.valueOf(this.getValue()));
      }
      @Override
      protected void cancelled() {
         lblResult.setText("취소됨");
      }
      @Override
      protected void failed() {
         lblResult.setText("예외 발생");   
      }
      
   }
}