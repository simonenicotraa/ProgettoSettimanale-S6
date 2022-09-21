package com.epicode.gestioneincendi.sonde;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
	public void aggiungiObserver(Observer observer) {
		observers.add(observer);
	}
	public void rimuoviObserver(Observer observer) {
		observers.remove(observer);
	}
}
