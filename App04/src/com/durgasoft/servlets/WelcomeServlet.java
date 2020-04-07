package com.durgasoft.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends GenericServlet{
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color: red;'>Welcome to Durga Software Solutions<hr></h1>");
		out.println("</body></html>");
		
	}

}
