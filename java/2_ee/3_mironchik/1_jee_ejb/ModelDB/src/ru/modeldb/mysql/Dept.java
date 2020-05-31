package ru.modeldb.mysql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept implements Serializable {
	@Id
	@Column(name = "deptno")
	private int id;
	private String dname;
	
	public Dept() {
		super();
	}
	
	public Dept(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
