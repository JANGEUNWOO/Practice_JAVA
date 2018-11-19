package Server;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class RootController implements Initializable{

	@FXML private Button toggleButton;
	@FXML private TextArea textArea;
	ChatMain chatmain=new ChatMain();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		String ip="192.168.23.1";
		int port=7000;
		toggleButton.setOnAction(event->{
			if(toggleButton.getText().equals("시작하기")) {
				chatmain.startServer(ip, port);
				Platform.runLater(()->{
					String message=String.format("[서버시작]\n",ip,port);
					textArea.appendText(message);
					toggleButton.setText("종료하기");
				});
			}else {
				chatmain.stopServer();
				Platform.runLater(()->{
					String message=String.format("[서버종료]\n",ip,port);
					textArea.appendText(message);
					toggleButton.setText("시작하기");
				});
			}
		});

	}

}
