package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class RootController implements Initializable {

	@FXML
	Button btn1;
	@FXML
	ListView<Menu> lv;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btn1.setOnAction(event -> handlebtn1(event));

	}

	private void handlebtn1(ActionEvent event) {

		System.out.println("�������Ѵ�");
		menuDao mdao = new menuDao();
		ArrayList<Menu> dtos = mdao.memberSelect();
		for (int i = 0; i < dtos.size(); i++) {
			// ArrayList<MemberDTO>���� �߰��� MemberDTO��ü�� �ϳ��� ������ �ִ�.
			Menu dto = dtos.get(i);
			String id = dto.getId();
			String name = dto.getName();
			String cost = dto.getCost();
			
		}

	}

}
