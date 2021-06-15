package main.java;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
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
    @FXML
    Label label;
    @FXML
    RadioButton color_btn;
    @FXML
    RadioButton label_btn;
    
    public void change() {
    	if (color_btn.isSelected())
    		changeColor();
    	else if (label_btn.isSelected())
    		changeLabel();
    }
    
    private String changeColor() {
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
    
    private String changeLabel() {
    	if(red_btn.isArmed()) {
    		label.setText("Rojo");
    		return "rojo";
    	}
    	else if(blue_btn.isArmed()) {
    		label.setText("Azul");
    		return "azul";
    	}
    	else if(green_btn.isArmed()) {
    		label.setText("Verde");
    		return "verde";
    	}
    	return "";
    }
    
}
