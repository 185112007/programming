package ru.specialist.dal;

import java.io.Closeable;
import java.io.IOException;

public class _2_DBConnection implements Closeable{
	
	public _2_DBConnection() {
		System.out.println("open connection");
	}
	
	public void execute() {
		System.out.println("execute command");
	}

	private boolean isClosed = false;
	
	@Override
	public void close() throws IOException {
		if (!isClosed) {
			System.out.println("close connection");
			isClosed = true;
		}
	}
	
}
