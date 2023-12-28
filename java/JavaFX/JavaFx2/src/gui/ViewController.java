package gui;

import javafx.scene.control.Button;

import javafx.fxml.FXML;

public class ViewController {

	@FXML
	private Button btMyButton;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
	}
	
}
