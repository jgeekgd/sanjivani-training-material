package com.urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class InboxUrlRewriting extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user_id");
		out.println("<body style='font-family:Rockwell,Segoe UI,serif;'>");
		out.println("Inbox " + user);
		out.println("</br></br><a href='index.html'>Back</a></br>");
	}
}