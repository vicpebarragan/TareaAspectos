package main.java;

public interface Observer {
	
	void update();
	void setSubject(Subject s);
	Subject getSubject();

}
