package com.http.session.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Logout extends HttpServlet {

	@SuppressWarnings("unused")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<body style='font-family:Rockwell,Segoe UI,serif;'>");
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Logout Page</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Logout Successful!</h1>");

			HttpSession session = request.getSession(false);
			if (Objects.isNull(session)) {
				response.sendRedirect("index.html");
				return;
			}
			String logoutUser = (String) session.getAttribute("UN");
			String logoutUserPass = (String) session.getAttribute("UP");
			out.println("<hr>Welcome " + logoutUser + "!");
			out.println("</br>Authentication Successful!");
			if (session.isNew())
				out.println("New Session.");
			else
				out.println("Old Session.");

			if (request.isRequestedSessionIdFromCookie())
				out.println("isRequestedSessionIdFromCookie: Yes");
			else
				out.println("isRequestedSessionIdFromCookie: No");

			//This is the actual code to log out the user 
			if (session != null) {
				session.invalidate();
			}
			out.println("<hr>Logged Out (Session Invalidated Successfully). Once you close browser you will see JSESSIONID disappear post session invalidation.<hr>");

			// Will Give Error:
//			out.println("<H4>Information on Your Session:</H4>\n" + "<TABLE BORDER=1 ALIGN=CENTER>\n"
//					+ "<TR BGCOLOR=\"#FFAD00\">\n" + "  <TH>Info Type<TH>Value\n" + "<TR>\n" + "  <TD>ID\n" + "  <TD>"
//					+ session.getId() + "\n" + "<TR>\n" + "  <TD>Creation Time\n" + "  <TD>"
//					+ new Date(session.getCreationTime()) + "\n" + "<TR>\n" + "  <TD>Time of Last Access\n" + "  <TD>"
//					+ new Date(session.getLastAccessedTime()) + "\n" + "<TR>\n");

			out.println("</br></br><a href='index.html'>Back</a></br>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

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
