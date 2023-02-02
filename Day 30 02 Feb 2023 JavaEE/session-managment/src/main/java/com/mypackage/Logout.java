package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Logout extends HttpServlet {

	@SuppressWarnings("unused")
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Logout Mail Page</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Logout Mail page </h1>");
			out.println("<hr>Authentication Successful<hr>");

			HttpSession session = request.getSession(false);
			if (session.isNew())
				out.println("New Session");
			else
				out.println("OLD Session");

			String composingUser = (String) session.getAttribute("UN");
			String composingUserPass = (String) session.getAttribute("UP");
			out.println("<br>Welcome " + composingUser + " !!!");

			session.invalidate();
			out.println("<hr>Logged Out(Session Invalidate)<hr>");

			// Will Give Error:
			out.println("<H4>Information on Your Session:</H4>\n"
					+ "<TABLE BORDER=1 ALIGN=CENTER>\n"
					+ "<TR BGCOLOR=\"#FFAD00\">\n"
					+ "  <TH>Info Type<TH>Value\n" + "<TR>\n" + "  <TD>ID\n"
					+ "  <TD>" + session.getId() + "\n" + "<TR>\n"
					+ "  <TD>Creation Time\n" + "  <TD>"
					+ new Date(session.getCreationTime()) + "\n" + "<TR>\n"
					+ "  <TD>Time of Last Access\n" + "  <TD>"
					+ new Date(session.getLastAccessedTime()) + "\n" + "<TR>\n");

			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

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
