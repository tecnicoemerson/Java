package gui;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import gui.util.Alerts;
import javafx.fxml.FXML;

public class ViewController {

	@FXML
	private Button btMyButton;
	
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Alert Title", "Alert header", "Hello", AlertType.INFORMATION);
	}
	
}
