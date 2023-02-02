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
	public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//usually use to call resources outside you application unlike RequestDispatcher
		//response.sendRedirect("http://www.google.com");
		//It will be not server internal transfer from one servlet to other its from client to server 
		// all external urls and other resource outisde the WEB-INF are invokable not ther internal resources to WEB-INF
		response.sendRedirect("index.html");
		
		//HTTP Status 405 – Method Not Allowed as Internal Resource
		//response.sendRedirect("Welcome");
		out.close();
	}
}
