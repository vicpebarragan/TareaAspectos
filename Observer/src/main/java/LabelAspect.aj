package main.java;

public aspect LabelAspect {
	
	pointcut success(): execution(String changeLabel());
	
	after() returning(String color): success() {
    	System.out.println("Se ha cambiado el texto a: "+color);
    }
}
