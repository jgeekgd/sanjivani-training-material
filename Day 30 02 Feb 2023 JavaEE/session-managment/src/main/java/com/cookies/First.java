package com.cookies;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class First extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// Retrieve the cookies, if any, stored in the client browser
		Cookie ck[] = request.getCookies();
		if (ck != null) 
		{
		
			for (int i = 0; i < ck.length; i++) 
			{
				out.println("Welcome " + ck[i].getValue());
				out.println("</br>");
				if (ck[i].getName().equals("username")) 
				{
					// Retrieve username from the cookie
					//ck[i].setMaxAge(0);
				 	//out.println("Cookie is deleted");
		        }
			}
		}
		
	}
}