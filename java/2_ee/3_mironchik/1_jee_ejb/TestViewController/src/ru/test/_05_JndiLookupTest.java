package ru.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/jnditest"})
public class _05_JndiLookupTest extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try{
			out.print("<html>");
			
			// connect to jndi tree
			// Java Context
			//		Java
			//			ConnectionFactory
			//			...
			//			ejb
			// Context is a common interface
			Context context = new InitialContext();
			NamingEnumeration ne = context.list("");	// root of server wildfly
			while (ne.hasMoreElements()) {
				Object object = (Object) ne.nextElement();
				out.print("<hr/>"+object);
			}
			// end jndi
			
			Object c;
			try {
				c = context.lookup("java:/counter");
			} catch (Exception e) {
				context.bind("java:/counter", 0L);
			}
			
			Long c1 = (Long)context.lookup("java:/counter");
			context.rebind("java:/counter", ++c1);
				
			out.print("<hr/>"+c1);
			out.print("</html>");
		}catch(Exception e) {
			out.print(e.toString());
		}finally {
			out.close();
		}
	}
}
