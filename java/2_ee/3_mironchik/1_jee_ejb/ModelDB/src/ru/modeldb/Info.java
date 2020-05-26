package ru.modeldb;

import java.io.Serializable;
import java.time.LocalTime;

public class Info implements Serializable {
	private String caption;
	private LocalTime time;
	
	public Info(String caption, LocalTime time) {
		super();
		this.caption = caption;
		this.time = time;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
}
