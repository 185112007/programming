package ru.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/sessiontest"})
public class _02_SessionTest extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try{
			out.print("<html>");
			
			HttpSession session=request.getSession();		
			try {
				if(session.getAttribute("counter") == null)
					throw new Exception();
			}catch (Exception e) {
				session.setAttribute("counter", 0L);
			}
			Long counter = (Long)session.getAttribute("counter");
			counter++;
			session.setAttribute("counter", counter);
			TimeUnit.MICROSECONDS.sleep(50);
			
			out.print("<hr/>"+counter);
			out.print("</html>");
		}catch(Exception e) {
			out.print(e.toString());
		}finally {
			out.close();
		}
	}
}
