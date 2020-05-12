package ru.boostbrain.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "zakaz")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(mappedBy = "order")
	private List<ThingInOrder> thingInOrder;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<ThingInOrder> getThingInOrder() {
		return thingInOrder;
	}

	public void setThingInOrder(List<ThingInOrder> thingInOrder) {
		this.thingInOrder = thingInOrder;
	}
	
	
}
