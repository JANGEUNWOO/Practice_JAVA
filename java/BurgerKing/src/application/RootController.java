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

		System.out.println("찍히긴한다");
		menuDao mdao = new menuDao();
		ArrayList<Menu> dtos = mdao.memberSelect();
		for (int i = 0; i < dtos.size(); i++) {
			// ArrayList<MemberDTO>에서 추가된 MemberDTO객체를 하나씩 꺼내고 있다.
			Menu dto = dtos.get(i);
			String id = dto.getId();
			String name = dto.getName();
			String cost = dto.getCost();
			
		}

	}

}
