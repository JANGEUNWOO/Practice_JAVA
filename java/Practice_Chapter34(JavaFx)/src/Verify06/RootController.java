package Verify06;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {

	@FXML
	private TableView<Car> tableView;

	@FXML
	private ImageView imageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		ObservableList<Car> carList = FXCollections.observableArrayList(new Car("�ΰ�Ƽ", "�ΰ�Ƽ.jpg"),
				new Car("������", "������.jpg"), new Car("���", "���.jpg"), new Car("�ѽ����̽�", "�ѽ����̽�.jpg"));

		TableColumn tccar = tableView.getColumns().get(0);
		tccar.setCellValueFactory(new PropertyValueFactory("scar"));
		tccar.setStyle("-fx-alignment : CENTER;"); // CSS��Ÿ���̴� �ڿ� �Ѵ�

		tableView.setItems(carList);

		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Car>() {

			@Override
			public void changed(ObservableValue<? extends Car> observable, Car oldValue, Car newValue) {
				if (newValue != null) {

					imageView.setImage(new Image(getClass().getResource("images/" + newValue.getImage()).toString()));
				}

			}
		});

	}

}
