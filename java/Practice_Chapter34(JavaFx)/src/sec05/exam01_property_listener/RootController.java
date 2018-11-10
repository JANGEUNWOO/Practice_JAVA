package sec05.exam01_property_listener;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {

   @FXML
   private Label Label1;
   @FXML
   private Label Label2;
   // slider는 0,0dptj 100.0의 값을 지닌다.
   @FXML
   private Slider slider;

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      System.out.println(Thread.currentThread().getName());
      // slider컨트롤의 속성값을 감시하기 위해 valueProperty()에 ChangeListner를 등록한다.
      slider.valueProperty().addListener(new ChangeListener<Number>() {
         // oldValue는 변경되기 이전값, newValue는 변경된 값을 의미한다.
         // <? extends Number>는 제네릭 와일드카드타입으로 Number클래스나
         // Number를 상속받는 하위클래스만 오도록 상위타입 제한을 의미한다.
         // 제네릭에서 이미 학습한 바 있다.

         @Override
         public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            //Slider의 값의 변경(속성감시)에 따라 Label컨트롤의 Font설정의 갑을 매핑함으로써,
            //글자의 크기가 바뀌게 되는 것이다. 
            Label1.setFont(new Font(newValue.doubleValue()));
            Label2.setFont(new Font(newValue.doubleValue()));
            System.out.println("변경전 값 : "+ oldValue.doubleValue());
            System.out.println("변경후 값 : "+ newValue.doubleValue());
         }
      });

   }
}