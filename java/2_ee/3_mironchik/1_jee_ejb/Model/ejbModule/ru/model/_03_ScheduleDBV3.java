package ru.model;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@Singleton
//@Startup
public class _03_ScheduleDBV3 {
	@PersistenceContext(unitName = "ModelPG")
	private EntityManager em;
	
	private Logger log = Logger.getLogger("TEST.MODEL");
	
	@PostConstruct			
	public void myInit() {
		log.info("----Modul Model Started V3----");
	}
	
	@PreDestroy
	public void myDestroy() {
		log.info("----Modul Model Destroyed V3----");
	}
	
	@Schedule(hour = "*", minute = "*", second = "*/5")		// test every 5 seconds
	public void testConnect() throws NamingException {
		
		Context context = null;
		try {
			context = new InitialContext();
			context.rebind("java:/error", "");
		} catch (Exception ex) {
			context.bind("java:/error", "");
		}
		
		try {
			em.createNativeQuery("select now()").getResultList();
			//log.info("Ok");
		}catch(Exception e) {
			//log.info("----Test Connection failed!!!----" + em);
			try {
				context.rebind("java:/error", "No connection");
			} catch (Exception e2) {
				log.info("----Exception in rebind() V3----");
			}
		}
		
	}
}
