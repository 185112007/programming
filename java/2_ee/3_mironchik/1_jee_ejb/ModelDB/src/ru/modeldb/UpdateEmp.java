package ru.modeldb;

import java.io.Serializable;

import ru.modeldb.postgres.Emp;

public class UpdateEmp implements Serializable {
	private String action;
	private Emp emp;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "UpdateEmp [action=" + action + ", emp=" + emp + "]";
	}
}
