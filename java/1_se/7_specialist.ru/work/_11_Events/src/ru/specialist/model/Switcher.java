package ru.specialist.model;

import java.util.ArrayList;

import ru.specialist.interfaces.ElectricityListener;

public class Switcher {
	
	private ArrayList<ElectricityListener> listeners = new ArrayList<>();
	
	public void addElectricityListener(ElectricityListener l) {
		listeners.add(l);
	}
	
	public void removeElectricityListener(ElectricityListener l) {
		listeners.remove(l);
	}
	
	public void switchOn() {
		System.out.println("switch on");
		for (ElectricityListener l : listeners) {
			l.electricity(this);
		}
	}
}
