package main.java;

public interface Observer {
	
	void setSubject(Subject s);
	Subject getSubject();
	void update();

}
