package com.gafur.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/hello", "/hi"})
public class HelloServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.append("Hello World " + req.getMethod());
		
		HttpSession session = req.getSession();
		
		if(session.getValue("name") == null) {
			session.putValue("name", "Hello World Session");
			out.append(" No session");
		}else {
			out.append(session.getValue("name").toString());
		}
		
	}
}
