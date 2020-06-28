package ru.specialist.dal;

public class _1_DBConnection {
	
	public _1_DBConnection() {
		System.out.println("open connection");
	}
	
	public void execute() {
		System.out.println("execute command");
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("close connection");
	}
}
