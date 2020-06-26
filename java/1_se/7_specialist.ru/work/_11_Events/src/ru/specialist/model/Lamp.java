package ru.specialist.model;

import ru.specialist.interfaces.ElectricityListener;

public class Lamp implements ElectricityListener{

	@Override
	public void electricity(Object source) {
		System.out.println("Lamp on");
	}

}
