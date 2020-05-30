package ru.phones;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ru.modeldb.Info;
import ru.modeldb.Message;

/**
 * Session Bean implementation class Main
 */
@Stateless
@LocalBean /* says that Main EJB does not have Local or Remote interfaces */
@Path(value = "/phones") /* dostup k klassu */
@Produces(value = "application/json") /* tip response */
@Consumes(value = "application/json") /* tip request */
public class Main {

	@PersistenceContext(unitName = "mysql-root")
	private EntityManager emMysql;
	@PersistenceContext(unitName = "pg-admin")
	private EntityManager emPostgres;

	/**
	 * Default constructor.
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	@Path(value = "/info") /* dostup k methodu */
	@GET /* vid metoda */
	public Info info() {
		return new Info("Telefonnyy spravocnyy", LocalTime.now());
	}

	@Path(value = "/infodb") /* dostup k methodu */
	@GET /* vid metoda */
	public Info infoDB() {
		Info info = new Info("Telefonnyy spravocnyy", LocalTime.now());
		info.setMysqlInfo(emMysql.toString());
		info.setPostgresInfo(emPostgres.toString());
		return info;
	}

	@Path(value = "/phones") /* dostup k methodu */
	@GET
	public List<Object[]> getPhones(@QueryParam(value = "find") String nomer){
		
		Thread.currentThread().setName("++++++++JDBC-Phones+++++++++");
		
    	if(nomer.length()>2) {
    		String query = "select * from base where nomer like ?";
    		Query q = emMysql.createNativeQuery(query);
    		q.setParameter(1, nomer + "%");
    		List<Object[]> list = q.getResultList();
    		return list;
    	}else {
    		return Collections.singletonList(
    				new Object[]{new Message(1, "nomer <= 2")});
    	}
    }
}
