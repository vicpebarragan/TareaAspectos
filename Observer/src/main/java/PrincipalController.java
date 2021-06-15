package main.java;

import java.util.LinkedList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

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
	String color="";
    
    public void changeToRed() {
    	pane.setStyle("-fx-background-color: red;");
    	color= "rojo";
    }
    public void changeToGreen() {
    	pane.setStyle("-fx-background-color: green;");
    	color= "verde";
    }
    public void changeToBlue() {
    	pane.setStyle("-fx-background-color: blue;");
    	color = "azul";
    }
    
    public String getColor() {
    	return this.color;
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
