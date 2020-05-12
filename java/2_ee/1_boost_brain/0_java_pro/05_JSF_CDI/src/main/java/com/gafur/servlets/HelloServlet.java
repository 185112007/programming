package com.gafur.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gafur.beans.ExampleBean;

@WebServlet(urlPatterns = {"/hello", "/hi"})
public class HelloServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ExampleBean exampleBean;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.append("Login: " + exampleBean.getLogin());
		out.append("\r\nPassword: " + exampleBean.getPassword());
		
		
		
	}
}
