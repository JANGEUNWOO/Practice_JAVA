package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class RootController2 implements Initializable {

	// Selected_list관련 FXML변수들
@FXML
TableView<Menu> cook_tv1;

@FXML
TableColumn<Menu, String> tv1_name;

@FXML
Button btn1, btn0;

MenuDao mdao=new MenuDao();

@Override
public void initialize(URL arg0, ResourceBundle arg1) {

	tv1_name.setCellValueFactory(new PropertyValueFactory<>("name"));
	btn1.setOnAction(event -> btn1Handler());
	btn0.setOnAction(event -> btn0Handler());
}

private void btn0Handler() {

	mdao.DBreturn();
	for (int i = 0; i < mdao.getData().size(); i++) {
		String get = mdao.getData().get(i).getName();
		cook_tv1.setItems(mdao.getData());
		System.out.println(get);
	}

}

private void btn1Handler() {
	Parent parent;
	try {
		// ((Node) (event.getSource())).getScene().getWindow().hide();
		parent = FXMLLoader.load(getClass().getResource("WaitingNumber.fxml"));
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("대기 번호 확인");
		stage.show();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	
	cook_tv1.getItems().removeAll(cook_tv1.getItems());
}

}

