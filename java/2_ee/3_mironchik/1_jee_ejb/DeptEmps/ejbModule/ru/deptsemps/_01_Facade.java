package ru.deptsemps;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.Connection;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import ru.modeldb.UpdateEmp;
import ru.modeldb.mysql.Dept;
import ru.modeldb.postgres.Emp;

/**
 * Session Bean implementation class _01_Facade
 */
@Stateless
@LocalBean
@Path(value = "/hr") /* dostup k klassu */
@Produces(value = "application/json") /* tip response */
@Consumes(value = "application/json") /* tip request */
@TransactionManagement(value = TransactionManagementType.CONTAINER)
public class _01_Facade {

	@PersistenceContext(unitName = "mysql-root")
	private EntityManager emMysql;
	@PersistenceContext(unitName = "pg-admin")
	private EntityManager emPostgres;

	/**
	 * Default constructor.
	 */
	public _01_Facade() {
		// TODO Auto-generated constructor stub
	}

	@Path(value = "/depts")
	@GET
	public List<Dept> getDepts() {
		return emMysql.createNativeQuery("select * from dept order by dname", Dept.class).getResultList();
	}

	@Path(value = "/emps/{deptno}")
	@GET
	public List<Emp> getEmps(@PathParam(value = "deptno") int deptno) {
		return emPostgres.createNamedQuery("GetEmpsByDeptNo", Emp.class).setParameter("p", deptno).getResultList();
	}

	@Path(value = "/emp")
	@POST
	public Emp getEmp(int empno) throws Exception {
		Emp emp = emPostgres.find(Emp.class, empno);
		if (emp == null) {
			throw new Exception("Zapis empno=" + empno + " ne naydena!");
		} else {
			return emp;
		}
	}

	@Path(value = "/updateemp")
	@POST
	@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
	public Emp updateEmp(Emp emp) throws Exception {
		Emp oldEmp = emPostgres.find(Emp.class, emp.getEmpno());
		if (oldEmp == null) {
			throw new Exception("Zapis: " + emp + " ne naydena!");
		} else {
			// merge = update
			emPostgres.merge(emp);
			UpdateEmp ue = new UpdateEmp();
			ue.setAction("UPDATE");
			ue.setEmp(emp);
			sendMessage(ue);
			return emp;
		}
	}
	
	@Resource(mappedName = "java:/jms/AdminFactory")
	private QueueConnectionFactory factory;
	@Resource(mappedName = "java:/jms/AdminQueue")
	private Queue queue;
	
	@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
	private void sendMessage(UpdateEmp ue) {
		try(Connection conn = factory.createConnection()) {
			try(Session session = conn.createSession(Session.AUTO_ACKNOWLEDGE)) {
				try(MessageProducer mp = session.createProducer(queue)) {
					ObjectMessage om = session.createObjectMessage(ue);
					mp.send(om);
				} catch (Exception e) {
					throw e;
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
