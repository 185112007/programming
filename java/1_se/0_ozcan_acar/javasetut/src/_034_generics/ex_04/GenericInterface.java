package _034_generics.ex_04;

public interface GenericInterface<E,T,X> {
	E getE();
	T getT();
	X getX();
}

class GenerikInterfaceImpl implements GenericInterface<String, Integer, Double>{

	@Override
	public String getE() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getT() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getX() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
