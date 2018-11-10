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
      
      //�͸��� ��ü
      btnStart.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
            handleBtnStart(event);
         }
      });
      
      // ���ٽ�
      btnStop.setOnAction(event -> handleBtnStop(event));
      
      timeService = new TimeService();
      //���α׷� ���۽� �ٷ� �����ϰԲ� �ߴ�.
      // start()�� restart()�� ȣ��Ǹ� �ڵ����� createTask()�� ȣ���Ѵ�!!
      timeService.start();
   }
   
   
   public void handleBtnStart(ActionEvent e) {
      timeService.restart();
      lblResult.setText("");
   }
   
   public void handleBtnStop(ActionEvent e) {
      timeService.cancel();
   }
   
   // ��øŬ���� TimeService
   class TimeService extends Service<Integer>{
      //ServiceŬ������ createTask()������
      @Override
      protected Task<Integer> createTask() {
         //Service�� ���� TAsk��ü ����
         Task<Integer> task = new Task<Integer>() {
            @Override
            protected Integer call() throws Exception {
               int result = 0;
               for(int i=0; i<=100;i++) {
                  if(this.isCancelled()) {
                     break;
                  }
                  result +=i;
                  
                  //ProgressBar����
                  updateProgress(i, 100);
                  //Label ����
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
      
      //Service��ü�� �Ʒ� 3���� �ݹ� �޼��带 ������ �Ѵ�.
      // �� �޼������ javafx ���ø����̼� �����尡 �����ϹǷ� ui�����ڵ带 ���
      // ������ �ڵ�����
      
      @Override
      protected void succeeded() {
         lblResult.setText(String.valueOf(this.getValue()));
      }
      @Override
      protected void cancelled() {
         lblResult.setText("��ҵ�");
      }
      @Override
      protected void failed() {
         lblResult.setText("���� �߻�");   
      }
      
   }
}