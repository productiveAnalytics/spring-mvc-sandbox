package com.productiveAnalytics.javaee;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE8

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2477807873272467449L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException
	{
		// LEVEL 1 : 
		//   Url-mapped Servlet directly handles (i.e. WITHOUT Front Controller) requests.
		//   And, the servlet itself renders UI i.e. hard-coded HTML
		/*
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo!!!!!!!! from Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My simple Servlet (Java EE 8.0)");
		out.println("</body>");
		out.println("</html>");
		*/
		
		// LEVEL 2 : 
		//   Url-mapped Servlet directly handles (i.e. WITHOUT Front Controller) requests, 
		//   however the actual request is forwarded to View i.e. JSP
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp")
			   .forward(request, response);
	}

}