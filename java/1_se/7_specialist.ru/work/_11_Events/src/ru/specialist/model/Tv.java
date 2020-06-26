package ru.specialist.model;

import ru.specialist.interfaces.ElectricityListener;

public class Tv implements ElectricityListener{

	@Override
	public void electricity(Object source) {
		System.out.println("Tv on");
	}
	
}
