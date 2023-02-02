package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class AuthenticateServlet extends HttpServlet {

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {

			out.println("<html>");
			out.println("<head>");
			out.println("<title>GD Mail AuthenticateServlet</title>");
			out.println("</head>");
			out.println("<body>");

			String un = request.getParameter("UName");
			String up = request.getParameter("UPass");

			if ((un.equalsIgnoreCase("Admin") && (up.equals("admin@123")))) {

				HttpSession session = request.getSession(true);

				session.setAttribute("UN", un);
				session.setAttribute("UP", up);
				out.println("<hr>Authentication Successful<hr>");
				out.println("Welcome " + un + " !!!");
				out.println("<br/><br/><a href='Inbox'>INBOX</a><br/>");
				out.println("<br/><a href='Compose'>COMPOSE</a><br/>");
				out.println("<br/><a href='Sent'>SENT</a><br/>");
				out.println("<br/><a href='Logout'>LOG OUT</a><br/>");
				out.println("</body>");
				out.println("</html>");
			} else {
				out.println("<hr><h3>Authentication Failed Wrong user Name or Password</h3><hr>");
				out.println("</body>");
				out.println("</html>");
			}

		} finally {
			out.close();
		}
	}

	// <editor-fold defaultstate="collapsed"
	// desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
