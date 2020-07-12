package ru.specialist;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

	@FXML
	private Label labelResult;
	
	@FXML
	private TextField txtUserName;
	
	@FXML
	private void onButtonClick() {
		String userName = txtUserName.getText();
		String result = String.format("Hello, %s!", userName);
		labelResult.setText(result);
	}
	
}
