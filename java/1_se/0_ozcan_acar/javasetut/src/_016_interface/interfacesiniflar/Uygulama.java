package _016_interface.interfacesiniflar;

public class Uygulama implements BirinciInterface, IkinciInterface{

	@Override
	public void ikinci() {
		System.out.println("ikinci metot");
	}

	@Override
	public void birinci() {
		System.out.println("birinci metot");
	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.birinci();
		uygulama.ikinci();
		
		System.out.println();
		
		BirinciInterface uyg2 = new Uygulama();
		uyg2.birinci();
		((IkinciInterface)uyg2).ikinci();
	}
	
}
