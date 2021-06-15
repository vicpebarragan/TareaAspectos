package main.java;

import java.io.IOException;
import java.util.LinkedList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class PrincipalController implements Subject{

    @FXML
    Button red_btn;
    @FXML
    Button green_btn;
    @FXML
    Button blue_btn;
    @FXML
    AnchorPane pane;
    
    LinkedList<Observer> observers = new LinkedList<>();
    
    public void changeToRed() {
    	pane.setStyle("-fx-background-color: red;");
    }
    public void changeToGreen() {
    	pane.setStyle("-fx-background-color: green;");
    }
    public void changeToBlue() {
    	pane.setStyle("-fx-background-color: blue;");
    }
    
	@Override
	public void add(Observer obs) {
		observers.add(obs);
		
	}
	
	@Override
	public void remove(Observer obs) {
		observers.remove(obs);
		
	}
	
	@Override
	public LinkedList getObservers() {
		return observers;
	}
    
	
}
