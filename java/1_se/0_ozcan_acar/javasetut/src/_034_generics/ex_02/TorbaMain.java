package _034_generics.ex_02;

public class TorbaMain {

	public static void main(String[] args) {
		
		//1.
		Torba torba = new Torba();
		torba.torbayaAt("elma");
		
		System.out.println(torba.torbadanAl());
		
		//2.
		GenericTorba<String> gt1 = new GenericTorba<>();
		gt1.torbayaAt("elma");
		System.out.println(gt1.torbadanAl());
		
		GenericTorba<Integer> gt2 = new GenericTorba<>();
		gt2.torbayaAt(1);
		System.out.println(gt2.torbadanAl());
		
	}

}
