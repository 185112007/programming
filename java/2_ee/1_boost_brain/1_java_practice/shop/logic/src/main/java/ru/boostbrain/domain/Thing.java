package ru.boostbrain.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Thing {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private int quantity;
	
	@OneToMany(mappedBy = "thing")
	private List<ThingInOrder> thingInOrder;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public List<ThingInOrder> getThingInOrder() {
		return thingInOrder;
	}
	public void setThingInOrder(List<ThingInOrder> thingInOrder) {
		this.thingInOrder = thingInOrder;
	}
}
