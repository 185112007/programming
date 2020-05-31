package ru.deptsemps;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ru.modeldb.mysql.Dept;

/**
 * Session Bean implementation class _01_Facade
 */
@Stateless
@LocalBean
@Path(value = "/hr") /* dostup k klassu */
@Produces(value = "application/json") /* tip response */
@Consumes(value = "application/json") /* tip request */
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
    public List<Dept> getDepts(){
    	return emMysql.createNativeQuery("select * from dept order by dname", Dept.class).getResultList();
    }
}
