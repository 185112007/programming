package ru.boostbrain.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ru.boostbrain.domain.Thing;

@Stateless
@LocalBean
public class ThingsManagerBean {
	
	@PersistenceContext(unitName = "examplePU")
	private EntityManager entityManager;
	
	public Thing createThing(String name, int quantity) {
		Thing thing = new Thing();
		thing.setName(name);
		thing.setQuantity(quantity);
		entityManager.persist(thing);
		
		return thing;
	}
	
	public List<Thing> getThings(){
		TypedQuery<Thing> query = 
				entityManager.createQuery(
						"select c from Thing c", Thing.class
						);
		return query.getResultList();
	}
}
