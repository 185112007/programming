package com.gafur;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class OrderBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int quantity;
	private ArrayList<Thing> things;
	private ArrayList<Thing> thingsInOrder;
	
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
	
	public void createThing() {
		
	}
	
	public void createOrder() {
		
	}
	
	public ArrayList<Thing> getThings() {
		return things;
	}
	public void setThings(ArrayList<Thing> things) {
		this.things = things;
	}
	
	public void setThingsInOrder(ArrayList<Thing> thingsInOrder) {
		this.thingsInOrder = thingsInOrder;
	}
	
	public ArrayList<Thing> getThingsInOrder() {
		return thingsInOrder;
	}
	
	public void addThing(Thing thing) {
		things.add(thing);
	}
}
