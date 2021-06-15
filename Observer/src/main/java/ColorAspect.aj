package main.java;

public aspect ColorAspect {
	
	pointcut success(): execution(String changeColor());
	
	after() returning(String color): success() {
    	System.out.println("Se ha cambiado el color a: "+color);
    }

}
