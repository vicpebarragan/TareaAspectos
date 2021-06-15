package main.java;

import java.util.Collection;
import java.util.LinkedList;

public interface Subject {
	void add(Observer obs);
	void remove(Observer obs);
	LinkedList getObservers();
}
