package ua.rba;

public enum SeasonEnum {
	// enumuraciya sozdana dlya togo ctoby opisyvat konstanty
	Winter("Zimniy", 1), Rain("Dojdey", 2), Soft("Barhatnyy", 3);
	
	private String _name;
	private int _id;
	
	private SeasonEnum(String name, int id) {
		_name = name;
		_id = id;
	}
	
	
	
	public int get_id() {
		return _id;
	}


	@Override
	public String toString() {
		return _name + " " + _id;
	}
}
