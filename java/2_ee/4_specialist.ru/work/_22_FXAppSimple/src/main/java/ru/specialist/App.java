package ru.specialist;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        try {
        	AnchorPane root = new AnchorPane();
        	
        	Button button = new Button();
        	button.setText("Exit");
        	button.setOnAction(x -> System.exit(0));
        	
        	root.getChildren().add(button);
        	
        	Scene scene = new Scene(root, 400, 400);
        	
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

    public static void main(String[] args) {
        launch();
    }

}