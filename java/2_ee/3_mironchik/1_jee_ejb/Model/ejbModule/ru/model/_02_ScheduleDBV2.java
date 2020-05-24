package ru.model;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@Singleton
//@Startup
public class _02_ScheduleDBV2 {
	@PersistenceContext(unitName = "ModelPG")
	private EntityManager em;
	
	private Logger log = Logger.getLogger("TEST.MODEL");
	
	@PostConstruct			
	public void myInit() {
		log.info("----Modul Model Started V2----");
	}
	
	@PreDestroy
	public void myDestroy() {
		log.info("----Modul Model Destroyed V2----");
	}
	
	@Schedule(hour = "*", minute = "*", second = "*/25")		// test every 25 seconds
	public void testConnect() throws NamingException {
		
		log.info("----Test Connection V2----" + em);	
		
	}
}
