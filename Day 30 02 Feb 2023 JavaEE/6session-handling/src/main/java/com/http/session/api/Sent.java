 
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
public class Sent extends HttpServlet {
    
    @SuppressWarnings("unused")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<body style='font-family:Rockwell,Segoe UI,serif;'>");
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sent Mail Page</title>");
            out.println("</head>");
            out.println("<body>");
            HttpSession session=request.getSession(false);
            if (Objects.isNull(session)) {
				response.sendRedirect("httpSession.html");
				return;
			}
            String sentUser=(String)session.getAttribute("UN");
            String sentUserPass=(String)session.getAttribute("UP");

			out.println("<hr>Welcome " + sentUser + "!");
			out.println("</br>Sent Mail Page");
			out.println("</br>Authentication Successful!");
			if (session.isNew())
				out.println("New Session.");
			else
				out.println("Old Session.");

			if (request.isRequestedSessionIdFromCookie())
				out.println("isRequestedSessionIdFromCookie: Yes");
			else
				out.println("isRequestedSessionIdFromCookie: No");
			out.println(
					"<ul style='background-color: #FFAD00;list-style-type: none;text-align: center;margin: 0; padding: 0;'> "
							+ "<li style='display: inline-block;padding: 2px;'>"
							+ "<a href=\"Inbox\">Inbox</a></li><li style='display: inline-block;padding: 2px;'>"
							+ "<a href=\"Compose\">Compose</a></li><li style='display: inline-block;padding: 2px;'>"
							+ "<a href=\"Sent\">Sent</a></li><li style='display: inline-block;padding: 2px;'>"
							+ "<a href=\"Logout\">Logout</a></ul>");
			out.println("<hr>");
			out.println("<H4>Information about your Session:</H4>\n" + "<TABLE BORDER=1 ALIGN=CENTER>\n"
					+ "<TR BGCOLOR=\"#FFAD00\">\n" + "  <TH>Info Type<TH>Value\n" + "<TR>\n" + "<TR>\n"
					+ "  <TD>JESSIONID (32 chars)\n" + "  <TD>" + session.getId() + "\n" + "<TR>\n"
					+ "  <TD>Session Creation Time\n" + "  <TD>" + new Date(session.getCreationTime()) + "\n" + "<TR>\n"
					+ "  <TD>Session Time of Last Access\n" + "  <TD>" + new Date(session.getLastAccessedTime()) + "\n"
					+ "<TR>\n" + "</TABLE>");
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
