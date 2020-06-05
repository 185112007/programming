package ru.message;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ru.modeldb.UpdateEmp;
import ru.modeldb.postgres.Emp;

/**
 * Message-Driven Bean implementation class for: UpdateMysql
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "java:/jms/AdminQueue"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "java:/jms/AdminQueue")
public class UpdateMysql implements MessageListener {

	@PersistenceContext(unitName = "mysql-root")
	private EntityManager emMysql;
	@PersistenceContext(unitName = "pg-admin")
	private EntityManager emPostgres;
	
    /**
     * Default constructor. 
     */
    public UpdateMysql() {
        // TODO Auto-generated constructor stub
    }
	
    @EJB
    private StatefullAdmin sf;
    
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
    	sf.info();			// test statefull ejb
        if (message instanceof ObjectMessage) {
			Object o;
			try {
				o = ((ObjectMessage)message).getObject();
				if (o instanceof UpdateEmp) {
					Emp emp = ((UpdateEmp)o).getEmp();
					emMysql.merge(emp);
				}
			} catch (JMSException e) {
				e.printStackTrace();
			}
			
		}
        sf.myDestroyFull();		// remove statefull ejb
    }

}
