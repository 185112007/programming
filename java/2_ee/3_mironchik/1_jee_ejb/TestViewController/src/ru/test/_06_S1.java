package ru.test;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.model.FLocal;

/**
 * Servlet implementation class _06_S1
 */
@WebServlet("/s1")
public class _06_S1 extends HttpServlet {
	@EJB		/* injection EJB component */
	private FLocal facade;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public _06_S1() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter()
			.append("Served at: ")
			.append(request.getContextPath())
			.append(" --------> ")
			.append(facade.info())
			.append("\n")
			.append(facade.userInfo());
	}

}
