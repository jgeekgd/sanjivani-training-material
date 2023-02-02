package com.http.session.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class WelcomeServlet extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<body style='font-family:Rockwell,Segoe UI,serif;'>");
		try {

			out.println("<html>");
			out.println("<head>");
			out.println("<title>GD Mail AuthenticateServlet</title>");
			out.println("</head>");
			out.println("<body>");

			String un = request.getParameter("UName");
			String up = request.getParameter("UPass");

			if ((un.equalsIgnoreCase("admin") && (up.equals("admin@123")))) {
				//true- to create a new session for this request if necessary.
				//false- to return null if there's no current session.
				HttpSession session = request.getSession(true);
				if (Objects.isNull(session)) {
					response.sendRedirect("httpSession.html");
					return;
				}
				
				//public void setAttribute(String name, Object value);
				session.setAttribute("UN", un);
				session.setAttribute("UP", up);
				out.println("Welcome " + un + " !!!");
				out.println("<hr>Authentication Successful<hr>");
				out.println("<ul style='background-color: #FFAD00;list-style-type: none;text-align: center;margin: 0; padding: 0;'> "
						+ "<li style='display: inline-block;padding: 2px;'>"
						+ "<a href=\"Inbox\">Inbox</a></li><li style='display: inline-block;padding: 2px;'>"
						+ "<a href=\"Compose\">Compose</a></li><li style='display: inline-block;padding: 2px;'>"
						+ "<a href=\"Sent\">Sent</a></li><li style='display: inline-block;padding: 2px;'>"
						+ "<a href=\"Logout\">Logout</a></ul>");
				
//				out.println("<br/><br/><a href='Inbox'>Inbox</a><br/>");
//				out.println("<br/><a href='Compose'>Compose</a><br/>");
//				out.println("<br/><a href='Sent'>Sent</a><br/>");
//				out.println("<br/><a href='Logout'>Logout</a><br/>");
//				out.println("</br></br><a href='index.html'>Back</a></br>");
				
				out.println("</body>");
				out.println("</html>");
			} else {
				out.println("<hr><h3>Authentication Failed Wrong user Name or Password</h3><hr>");
				out.println("</br></br><a href='index.html'>Back</a></br>");
				out.println("</body>");
				out.println("</html>");
			}

		} finally {
			out.close();
		}
	}

	// <editor-fold defaultstate="collapsed"
	// desc="HttpServlet methods. Click on the + sign on the left to edit the
	// code.">

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
