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
   //fxml ��Ʈ�� ����.
   @FXML private ProgressBar progressBar;
   @FXML private Label lBlWorkDone;
   @FXML private Button btnStart;
   @FXML private Button btnStop;
   
   // ��� ���� ���� Task�� ����� ���� <Void>Ÿ�� ������.
   private Task<Void> task;
   @Override
   public void initialize(URL location, ResourceBundle resources) {
      // �̺�Ʈ ó���κ�
      // �͸�����ü
      btnStart.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
            handleBtnStart(event);
         }
      });
      //���ٽ�
      btnStop.setOnAction(event -> handleBtnStop(event));
   }
   //�̺�Ʈ ó�� �޼���
   public void handleBtnStart(ActionEvent event) {
      //������� ���� Task����, Task�� call()�߻�޼��带 ������ �־�
      //�����Ǹ� �Ͽ��� �Ѵ�.(�۾�����)
      task = new Task<Void>() {
         @Override
         protected Void call() throws Exception{
            for(int i=0; i<=100; i++) {
               //��Ұ� �Ǿ����� ��� ������.
               if(this.isCancelled()) {
                  this.updateMessage("��ҵ�");
                  break;
               }
               //updateProgress()�� ProgressBar�� ProgressIndicator����
               //���ѵǾ� �ִ�.
               this.updateProgress(i, 100); //i�� ���ప, 100�� �Ϸᰪ
               //�۾��� �Ϸ�Ǹ�, i���� lblWorkDone�� �ѷ��ش�.
               this.updateMessage(String.valueOf(i));
               
               //call()���� ����ó���� �Ǿ��ִ�. ������, ������ �ܺο���
               //interrupt()�� ȣ���ϸ� task�� ��ҵǵ��� ���� ���ܱ�����
               //�־���.
               try {
                  Thread.sleep(100);
               } catch(InterruptedException e) {
                  if(this.isCancelled()) {
                     this.updateMessage("��ҵ�");
                     break;
                  }
               }
            }
            return null;
         }
      };
      //�Ӽ����̵� �ڵ�
      //ProgressBar��Ʈ���� �Ӽ��� task�� updateProgress�� progress�Ӽ���
      //���ε��Ѵ�.
      //�̷��� ���ָ� ProgressBar�� ���������� ���� ���ϰ� �ȴ�.
      //�ֳ��ϸ�, task�� i���� ��� ���ϱ� �����̴�.
      progressBar.progressProperty().bind(task.progressProperty());
      //���� ���� Label��Ʈ���� �Ӽ��� updateMessage()�� �Ӽ��� ���ε���Ų��.
      lBlWorkDone.textProperty().bind(task.messageProperty());
      
      //������ ����, �Ű������� task�� �־���.
      //�ռ� ��������� Task�� Runnable�������̽��� �����߱� ������ �Ű�������
      //������ �ִ� ���̴�.
      Thread thread = new Thread(task);
      thread.setDaemon(true);
      thread.start();
   }
   //�̺�Ʈ ó�� �޼���
   public void handleBtnStop(ActionEvent event) {
      //'����'��ư�� Ŭ���ϸ� task�� ��Ҹ޼����� cancel()�� ȣ���ϸ�,
      //task�� ��ҽ�Ų��.
      task.cancel();
   }

}
