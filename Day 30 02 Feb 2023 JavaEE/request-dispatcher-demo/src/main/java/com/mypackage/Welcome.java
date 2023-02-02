package com.mypackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Welcome extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			String name = request.getParameter("user");
			
			out.println("<h2>Welcome "+name+" !</h2>");
		} finally {
			out.close();
		}
	}
}