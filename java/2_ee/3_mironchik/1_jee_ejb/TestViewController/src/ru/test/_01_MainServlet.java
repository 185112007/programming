package ru.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/test"})
public class _01_MainServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try{
			out.print("<html>");
			out.print("Hello Servlet");
			out.print("<hr/>");
			out.print("</html>");
		}catch(Exception e) {
			out.print(e.toString());
		}finally {
			out.close();
		}
	}
	
}
