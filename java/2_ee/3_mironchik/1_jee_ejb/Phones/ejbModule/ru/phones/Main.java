package ru.phones;

import java.time.LocalTime;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ru.modeldb.Info;

/**
 * Session Bean implementation class Main
 */
@Stateless
@LocalBean		/* says that Main EJB does not have Local or Remote interfaces */
@Path(value = "/phones")				/* dostup k klassu */
@Produces(value = "application/json")	/* tip response */
@Consumes(value = "application/json")	/* tip request */
public class Main {

    /**
     * Default constructor. 
     */
    public Main() {
        // TODO Auto-generated constructor stub
    }
    
    @Path(value = "/info")				/* dostup k methodu */
    @GET								/* vid metoda */
    public Info info() {
    	return new Info("Telefonnyy spravocnyy", LocalTime.now());
    }
}
