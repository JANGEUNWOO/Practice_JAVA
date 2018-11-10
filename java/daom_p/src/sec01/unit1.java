package sec01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class unit1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		gc = canvas.getGraphicsContext2D();
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(1);

		pane.getChildren().addAll(canvas, grid);
		// pane.setStyle("-fx-background-color: 칼라명"); //배경색 추가
		cp.setOnAction(e -> {
			gc.setStroke(cp.getValue());
		});

		slider.setMin(1);
		slider.setMax(100);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.valueProperty().addListener(e->{
			double value=slider.getValue();
			String str=String.format("%.1f", value);
			label.setText(str);
			gc.setLineWidth(1);
		});

		grid.addRow(0,cp, slider, label);
		grid.setHgap(20);
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setPadding(new Insets(20,0,0,0));

		scene.setOnMousePressed(e -> {
			gc.beginPath();
			gc.lineTo(e.getSceneX(), e.getSceneY());
			gc.stroke();
		});

		scene.setOnMouseDragged(e -> {
			gc.lineTo(e.getSceneX(), e.getSceneY());
			gc.stroke();
		});
		
		gc.fillRect(10,10, 10, 10);

		

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	Label label = new Label("1.0");
	GridPane grid = new GridPane();
	Canvas canvas = new Canvas(800, 500);
	ColorPicker cp = new ColorPicker();
	Slider slider = new Slider();

	GraphicsContext gc;
	StackPane pane = new StackPane();
	Scene scene = new Scene(pane, 800, 500);

	public static void main(String[] args) {
		launch(args);
	}
}
