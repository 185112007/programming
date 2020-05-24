package ru.model;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless()		/* register session bean */
//@Startup			/* this annotation does not starts on startup session beans */
public class _04_FacadeV1 implements FLocal, FRemote{
	
	@Resource
	private SessionContext sessionContext;
	private Long id;
	private Logger log = Logger.getLogger("TEST.MODEL");
	
	@PostConstruct			
	public void myInit() {
		id = System.nanoTime();
		log.info("----FacadeV1----id=" + id + " created-----");
	}
	
	@PreDestroy
	public void myDestroy() {
		log.info("====FacadeV1----id=" + id + " destroyed====");
	}

	@Override
	public String info() {
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello World! id=" + id;
	}

	@Override
	public String userInfo() {
		return "User: " + sessionContext.getCallerPrincipal();
	}
}
