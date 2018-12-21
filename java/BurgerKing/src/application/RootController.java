package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class RootController implements Initializable {

	// root관련 FXML 변수들
	@FXML
	Label total_amount;

	@FXML
	Button partCancel;

	@FXML
	Button allCancel;

	@FXML
	Button payment;

	@FXML
	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17,
			btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32,
			btn33, btn34, btn35, btn36, btn37, btn38, btn39, btn40, btn41, btn42, btn43, btn44, btn45, btn46, btn47,
			btn48, btn49, btn50, btn51, btn52, btn53;

	@FXML
	TableView<Menu> tv;

	@FXML
	TableColumn<Menu, String> tc_name;

	@FXML
	TableColumn<Menu, String> tc_cost;

	@FXML
	TextField totalprice;

	@FXML
	ToggleGroup group;

	@FXML
	RadioButton rb1;

	@FXML
	RadioButton rb2;

	MenuDao mdao = new MenuDao();

	/*
	 * public String radioselect() { String message = ""; if (rb1.isSelected()) {
	 * message += rb1.getText() + "\n"; } if (rb2.isSelected()) { message +=
	 * rb2.getText() + "\n"; } return message; }
	 */

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
		// 단품버거
		btn1.setOnAction(event -> handlebtn1(event));
		btn2.setOnAction(event -> handlebtn2(event));
		btn3.setOnAction(event -> handlebtn3(event));
		btn4.setOnAction(event -> handlebtn4(event));
		btn5.setOnAction(event -> handlebtn5(event));
		btn6.setOnAction(event -> handlebtn6(event));
		btn7.setOnAction(event -> handlebtn7(event));
		btn8.setOnAction(event -> handlebtn8(event));
		// 음료
		btn23.setOnAction(event -> handlebtn23(event));
		btn24.setOnAction(event -> handlebtn24(event));
		btn25.setOnAction(event -> handlebtn25(event));
		btn26.setOnAction(event -> handlebtn26(event));
		btn27.setOnAction(event -> handlebtn27(event));
		btn28.setOnAction(event -> handlebtn28(event));
		btn29.setOnAction(event -> handlebtn29(event));
		btn30.setOnAction(event -> handlebtn30(event));

		partCancel.setOnAction(event -> handlebtn_partCancel(event));
		allCancel.setOnAction(event -> handlebtn_allCancel(event));
		payment.setOnAction(event -> handle_payment(event));

		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {

			}
		});

	}

	// 버거
	private void handlebtn1(ActionEvent event) {

		mdao.menuSelect("1");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn8(ActionEvent event) {
		mdao.menuSelect("8");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn6(ActionEvent event) {
		mdao.menuSelect("6");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn7(ActionEvent event) {
		mdao.menuSelect("7");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn4(ActionEvent event) {
		mdao.menuSelect("4");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn5(ActionEvent event) {
		mdao.menuSelect("5");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn3(ActionEvent event) {
		mdao.menuSelect("3");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn2(ActionEvent event) {
		mdao.menuSelect("2");
		tv.setItems(mdao.getData());
		Calculator();
	}

	// 음료
	private void handlebtn23(ActionEvent event) {

		mdao.menuSelect("23");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn24(ActionEvent event) {
		mdao.menuSelect("24");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn25(ActionEvent event) {
		mdao.menuSelect("25");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn26(ActionEvent event) {
		mdao.menuSelect("26");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn27(ActionEvent event) {
		mdao.menuSelect("27");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn28(ActionEvent event) {
		mdao.menuSelect("28");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn29(ActionEvent event) {
		mdao.menuSelect("29");
		tv.setItems(mdao.getData());
		Calculator();
	}

	private void handlebtn30(ActionEvent event) {
		mdao.menuSelect("30");
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
		tv.getItems().removeAll(tv.getItems());
		Calculator();

	}

	private void handle_payment(ActionEvent event) {
		System.out.println("결제");
		mdao.selectedMenu_Insert();
		Parent parent;
		try {
			// ((Node) (event.getSource())).getScene().getWindow().hide();
			parent = FXMLLoader.load(getClass().getResource("Selected_list.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("주방 주문 확인");
			stage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		tv.getItems().removeAll(tv.getItems());
	}

}