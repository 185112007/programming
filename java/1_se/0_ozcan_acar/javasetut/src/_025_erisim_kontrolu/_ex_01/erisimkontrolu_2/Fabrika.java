package _025_erisim_kontrolu._ex_01.erisimkontrolu_2;

public class Fabrika {
	public static InterfaceSinifim make(int i) {
		if(i == 1) return new IlkImplementasyon();
		else if(i == 2) return new IkinciImplementasyon();
		return null;
	}
}
