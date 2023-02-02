package com.mypackage;

/*The sendRedirect() method of HttpServletResponse 
 * interface can be used to redirect response to another 
 * resource, it may be servlet, jsp or html file. 
 * It can accept relative URL. 
 * This method can work inside and outside the server 
 * as it uses the URL bar of the browser.
 * */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		response.sendRedirect("http://www.google.com");
		out.close();
	}
}


/* if you do
 * RequestDispatcher rd = request.getRequestDispatcher("http://www.google.com");
 * following error:
 * java.io.FileNotFoundException: The requested resource (/07RequestDispatcher/http:/www.google.com) is not available * 
 */