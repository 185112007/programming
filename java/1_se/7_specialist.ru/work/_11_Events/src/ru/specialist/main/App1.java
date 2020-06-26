package ru.specialist.main;

import ru.specialist.interfaces.ElectricityListener;
import ru.specialist.model.AirCondition;
import ru.specialist.model.Lamp;
import ru.specialist.model.Switcher;
import ru.specialist.model.Tv;

public class App1 {

	public static void fireFighters(Object s) {
		System.out.println("Fighters comes");
	}

	public static void main(String[] args) {
		Switcher sw = new Switcher();

		Lamp lamp = new Lamp();
		Tv tv = new Tv();

		sw.addElectricityListener(lamp); // event subscribe
		sw.addElectricityListener(tv);

		sw.addElectricityListener(new ElectricityListener() {

			@Override
			public void electricity(Object source) {
				System.out.println("Pojar!");
			}
		});

		// lambda expression
		sw.addElectricityListener((source) -> {
			System.out.println("Fire!");
		});

		AirCondition ac = new AirCondition();

		sw.addElectricityListener((o) -> ac.on(o));
		// or
		sw.addElectricityListener(ac::on);
		
		// static method
		sw.addElectricityListener((o) -> App1.fireFighters(o));
		//or
		sw.addElectricityListener(App1::fireFighters);

		sw.switchOn();
	}

}
