package main.java;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class PrincipalController {

    @FXML
    Button red_btn;
    @FXML
    Button green_btn;
    @FXML
    Button blue_btn;
    @FXML
    AnchorPane pane;
    
    public void changeToRed() {
    	pane.setStyle("-fx-background-color: red;");
    }
    public void changeToGreen() {
    	pane.setStyle("-fx-background-color: green;");
    }
    public void changeToBlue() {
    	pane.setStyle("-fx-background-color: blue;");
    }
}
