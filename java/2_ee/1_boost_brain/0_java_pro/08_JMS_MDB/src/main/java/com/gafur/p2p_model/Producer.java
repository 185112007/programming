//package com.gafur.p2p_model;
//
//import java.util.Date;
//
//import javax.annotation.Resource;
//import javax.ejb.LocalBean;
//import javax.ejb.Schedule;
//import javax.ejb.Stateless;
//import javax.jms.Connection;
//import javax.jms.ConnectionFactory;
//import javax.jms.Destination;
//import javax.jms.JMSException;
//import javax.jms.MessageProducer;
//import javax.jms.Session;
//import javax.jms.TextMessage;
//
//@Stateless
//@LocalBean
//public class Producer {
//	
//	@Resource(lookup = "java:/ConnectionFactory")
//	private ConnectionFactory connectionFactory;
//	
//	@Resource(lookup = "java:/jms/queue/ExpiryQueue")
//	private Destination destination;
//	
//	// this schedule works every 5 seconds
//	@Schedule(hour = "*", minute = "*", second = "*/5", persistent = false)
//	public void produceMessage() {
//		try {
//			Connection connection = connectionFactory.createConnection();
//			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//			MessageProducer messageProducer = session.createProducer(destination);
//			TextMessage msg = session.createTextMessage("Hello MDB queue. Time: " + new Date());
//			
//			messageProducer.send(msg);
//			
//			System.out.println("-------------------------------------------------");
//			
//			connection.close();
//			session.close(); 
//		} catch (JMSException e) {
//			e.printStackTrace();
//		}
//	}
//}
