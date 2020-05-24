package ru.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/logtest"})
public class _04_LoggingTest extends HttpServlet{
	
	private Logger log = Logger.getLogger("TEST");
	private int counter = 0;
	public _04_LoggingTest() {
		log.info("======App Started======" + Thread.currentThread());
	}

	@Override
	public void destroy() {
		log.info("++++=====App Destroyed=====+++");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try{
			out.print("<html>");
			
			log.info("service  !!!>>>>"+Thread.currentThread());
			TimeUnit.MICROSECONDS.sleep(50);
			counter++;
			out.print("<hr/>"+counter);
			out.print("</html>");
		}catch(Exception e) {
			out.print(e.toString());
		}finally {
			out.close();
		}
	}
}
