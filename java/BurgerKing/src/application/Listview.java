package application;

import java.io.File; 
import javafx.application.Application; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 
import javafx.scene.Scene; 
import javafx.scene.control.ListView; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage; 
public class Listview extends Application { 
     public static final ObservableList<String> names =  
         FXCollections.observableArrayList(); 
         
     public static void main(String[] args) { 
            launch(args); 
     } 
      
     @Override 
     public void start(Stage stage) { 
            stage.setTitle("List View Sample");         
             
            final ListView<String> listView = new ListView<String>(names); 
            listView.setPrefSize(200, 250); 
            listView.setEditable(true); 
             
            File dir = new File("."); 
      File[] files = dir.listFiles(); 
      for (int i = 0; i < files.length; i++) { 
         String filename = files[i].getName(); 
         names.add(filename); 
      } 
                    
            StackPane root = new StackPane(); 
            root.getChildren().add(listView); 
            stage.setScene(new Scene(root, 200, 250)); 
            stage.show(); 
     } 
} 
