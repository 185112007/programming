package ru.specialist.test;

public class Test {

	private String data;

	public Test(String data) {
		super();
		setData(data);
	}

	private void setData(String data) {
		this.data = data;
	}

	public String getData() {
		return this.data;
	}

	@Override
	public int hashCode() {
		return getData().hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Test) {
			Test t1 = (Test) obj;
			return getData().equals(t1.getData());
		} else
			return false;
	}

}
