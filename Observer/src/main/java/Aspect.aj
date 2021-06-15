package main.java;

public aspect Aspect {
	
	pointcut success(): execution(String changeColor());
	
	after() returning(String color): success() {
    	System.out.println("Se ha cambiado el color a: "+color);
    }

}
