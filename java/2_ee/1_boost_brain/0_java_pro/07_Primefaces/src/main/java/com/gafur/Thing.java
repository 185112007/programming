package com.gafur;

//import javax.enterprise.context.SessionScoped;
//import javax.inject.Named;
//
//@Named
//@SessionScoped
public class Thing {
	private String name;
	private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
