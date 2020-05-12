package ru.boostbrain.ejb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ru.boostbrain.domain.Order;
import ru.boostbrain.domain.Thing;
import ru.boostbrain.domain.ThingInOrder;

@Stateless
@LocalBean
public class OrdersManagerBean {
	
	@PersistenceContext(unitName = "examplePU")
	private EntityManager entityManager;
	
	
	public Order createOrder() {
		Order order = new Order();
		entityManager.persist(order);
		
		return order;
	}
	
	public boolean addToOrder(long thingId, long orderId, int quantity) {
		Thing thing = entityManager.find(Thing.class, thingId);
		
		if (thing == null) {
			return false;
		}
		
		Order order = entityManager.find(Order.class, orderId);
		if (order == null) {
			return false;
		}
		
		ThingInOrder thingInOrder = new ThingInOrder();
		thingInOrder.setOrder(order);
		thingInOrder.setThing(thing);
		thingInOrder.setQuantity(quantity);
		entityManager.persist(thingInOrder);
		
		return true;
	}
	
	public List<Thing> getThingsInOrder(long orderId){
		Order order = entityManager.find(Order.class, orderId);
		if (order == null) {
			return Collections.emptyList();
		}
		
		List<ThingInOrder> thingInOrders = order.getThingInOrder();
		List<Thing> result = new ArrayList<Thing>();
		for (ThingInOrder thingInOrder : thingInOrders) {
			result.add(thingInOrder.getThing());
		}
		
		return result;
	}
}
