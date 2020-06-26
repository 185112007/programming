package ru.specialist.enums;

public enum _02_Colors {
	Red, Green, Blue;
	
	public static final _02_Colors DEFAULT_COLOT = _02_Colors.Red;
	
	public String upperName() {
		return name().toUpperCase();
	}
}
