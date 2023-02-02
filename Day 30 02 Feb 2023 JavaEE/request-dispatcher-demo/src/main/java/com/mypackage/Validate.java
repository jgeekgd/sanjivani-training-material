package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Validate extends HttpServlet {

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String name = request.getParameter("user");
			String password = request.getParameter("pass");

			if (password.equals("studytonight")) {
				RequestDispatcher rd = request.getRequestDispatcher("Welcome");
				rd.forward(request, response);
			} else {
				out.println("<font color='red'><b>You have entered incorrect password</b></font>");
				RequestDispatcher rd = request.getRequestDispatcher("");
				rd.include(request, response);
			}
		} finally {
			out.close();
		}

	}
}