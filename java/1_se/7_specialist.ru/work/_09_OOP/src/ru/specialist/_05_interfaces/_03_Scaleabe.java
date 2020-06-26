package ru.specialist._05_interfaces;

public interface _03_Scaleabe {
	
	/*public static final*/ double DEFAULT_FACTOR = 2d;
	
	static void test() {
		System.out.println("test()");
	}
	
	void scale(double factor);
	
	default void scale() {
		scale(DEFAULT_FACTOR);
	}
}

interface _03_Scalable3D extends _03_Scaleabe{
	
	void scale3D(double fx, double fy, double fz);
	
}
