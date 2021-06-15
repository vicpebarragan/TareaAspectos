package main.java;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class PrincipalController{

    @FXML
    Button red_btn;
    @FXML
    Button green_btn;
    @FXML
    Button blue_btn;
    @FXML
    AnchorPane pane;
    
    public String changeColor() {
    	if(red_btn.isArmed()) {
    		pane.setStyle("-fx-background-color: red;");
    		return "rojo";
    	}
    	else if(blue_btn.isArmed()) {
    		pane.setStyle("-fx-background-color: blue;");
    		return "azul";
    	}
    	else if(green_btn.isArmed()) {
    		pane.setStyle("-fx-background-color: green;");
    		return "verde";
    	}
    	return "";
    }
    
}
