package main.java;

public interface Observer {
	
	void update();
	void notifyChanges(Subject s);
	void setSubject(Subject s);
	Subject getSubject();

}
