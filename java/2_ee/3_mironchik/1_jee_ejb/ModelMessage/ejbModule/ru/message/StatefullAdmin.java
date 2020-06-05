package ru.message;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class StatefullAdmin
 */
@Stateful
@LocalBean
public class StatefullAdmin {

	private Long id;
	private Logger log = Logger.getLogger("TEST.MODEL");
	
	@PostConstruct			
	public void myInit() {
		id = System.nanoTime();
		log.info("----StatefullAdmin----id=" + id + " created-----");
	}
	
	@PreDestroy
	public void myDestroy() {
		log.info("====StatefullAdmin----id=" + id + " destroyed====");
	}

	public void info() {
		System.out.println("--------------" + id);
	}
	
	@Remove
	public void myDestroyFull() {
		
	}
}
