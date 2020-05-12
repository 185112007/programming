package _025_erisim_kontrolu._ex_01.erisimkontrolu_3;

import _025_erisim_kontrolu._ex_01.erisimkontrolu_2.Fabrika;
import _025_erisim_kontrolu._ex_01.erisimkontrolu_2.InterfaceSinifim;

public class Uygulamam {

	public static void main(String[] args) {
		InterfaceSinifim is = Fabrika.make(1);
		is.metot();
		
	}

}
