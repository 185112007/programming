package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{

	@FXML
	private Label label;
	
	@FXML
	private Button button;
	
	@FXML
	private TextField nameInput;
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		String input = nameInput.getText();
		label.setText("Hello world!" + input);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
}
