package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class RootController implements Initializable {

   @FXML
   Label total_amount;

   @FXML
   Button partCancel;

   @FXML
   Button allCancel;

   @FXML
   Button payment;

   @FXML
   Button btn1;

   @FXML
   Button btn23;

   @FXML
   TableView<Menu> tv;

   @FXML
   TableColumn<Menu, String> tc_name;

   @FXML
   TableColumn<Menu, String> tc_cost;

   @FXML
   TextField totalprice;

   @FXML
   RadioButton rb1;

   @FXML
   RadioButton rb2;

   MenuDao mdao = new MenuDao();

   public String radioSelect() {
      String message = "";
      if (rb1.isSelected()) {
         message += rb1.getText() + "\n";
      }
      if (rb2.isSelected()) {
         message += rb2.getText() + "\n";
      }

      return message;

   }

   public void Calculator() {
      int price = 0;

      for (int i = 0; i < mdao.getData().size(); i++) {
         int temp = Integer.parseInt(mdao.getData().get(i).getCost());
         price += temp;
      }

      String totalpricecon = String.valueOf(price);
      totalprice.setText(totalpricecon);
   }

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      tc_name.setCellValueFactory(new PropertyValueFactory<>("name"));
      tc_cost.setCellValueFactory(new PropertyValueFactory<>("cost"));

      btn1.setOnAction(event -> handlebtn1(event));
      btn23.setOnAction(event -> handlebtn23(event));
      partCancel.setOnAction(event -> handlebtn_partCancel(event));
      allCancel.setOnAction(event -> handlebtn_allCancel(event));
      payment.setOnAction(event -> handle_payment(event));
      rb1.setOnAction(event -> handleRadio(event));
      rb2.setOnAction(event -> handleRadio(event));
      /*
       * rb1.setOnAction(event -> handle_rb1(event)); rb2.setOnAction(event ->
       * handle_rb2(event));
       */

   }

   private void handleRadio(ActionEvent event) {
      radioSelect();
   }

   /*
    * private void handle_rb1(ActionEvent event) {
    * 
    * System.out.println("매장식사");
    * 
    * }
    * 
    * private void handle_rb2(ActionEvent event) { System.out.println("Take out");
    * }
    */

   private void handlebtn1(ActionEvent event) {

      mdao.menuSelect("1");
      tv.setItems(mdao.getData());
      Calculator();
   }

   private void handlebtn23(ActionEvent event) {

      mdao.menuSelect("23");
      tv.setItems(mdao.getData());
      Calculator();
   }

   private void handlebtn_partCancel(ActionEvent event) {

      System.out.println("부분삭제");
      tv.getItems().removeAll(tv.getSelectionModel().getSelectedItems());
      Calculator();

   }

   private void handlebtn_allCancel(ActionEvent event) {

      System.out.println("전체삭제");
      tv.getItems().removeAll();
      Calculator();

   }

   private void handle_payment(ActionEvent event) {
      System.out.println("결제");
      mdao.selectedMenu_Insert();

   }

}