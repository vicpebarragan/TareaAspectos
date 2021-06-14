package main.java;

import java.util.Collection;

public interface Subject {
	
	void add(Observer obs);
	void remove(Observer obs);
	Collection<Observer> getObservers();
	Object getData();
}
