package ru.model;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

//@Singleton					/* annotation to register our enterprise bean with the application server. */
//@Startup					/* annotation which informs the application server to create an instance of the ScheduleDBV1 when the server starts. */
public class _01_ScheduleDBV1 {
	
	private Logger log = Logger.getLogger("TEST.MODEL");
	
	@PostConstruct			/* annotation instructs(bilgilendirmek) the container to execute this method as soon as it instantiates an object of the ScheduleDBV1 class */
	public void myInit() {
		log.info("----Modul Model Started V1----");
	}
	
	@PreDestroy
	public void myDestroy() {
		log.info("----Modul Model Destroyed V1----");
	}
	
	@Schedule(hour = "*", minute = "*/1")		/* annotation tells the container that this method must be executed every minute */
	public void testConnect(){
		log.info("----Test Connection V1----");
	}
}
