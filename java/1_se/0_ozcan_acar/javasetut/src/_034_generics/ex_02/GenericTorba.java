package _034_generics.ex_02;

public class GenericTorba<T> {
	T element;
	
	T torbadanAl() {
		return element;
	}
	
	void torbayaAt(T element) {
		this.element = element;
	}
}
