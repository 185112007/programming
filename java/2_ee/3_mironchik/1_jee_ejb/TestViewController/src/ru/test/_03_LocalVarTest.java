package ru.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/vartest"})
public class _03_LocalVarTest extends HttpServlet{
	private int counter=0;	// tum threadler bu degiskene ulasiyor
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try{
			out.print("<html>");
			
			TimeUnit.MICROSECONDS.sleep(50);
			
			out.print("<hr/>"+(++counter));
			out.print("</html>");
		}catch(Exception e) {
			out.print(e.toString());
		}finally {
			out.close();
		}
	}
}
