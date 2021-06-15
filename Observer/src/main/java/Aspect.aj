package main.java;

public aspect Aspect {
	
	public pointcut cambiarColor(Subject s);
	after(Subject s): cambiarColor(s){
		System.out.println("color: "); // ahi va el color  
	}
	

}
