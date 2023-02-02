 
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
public class Inbox extends HttpServlet {
   
  
    @SuppressWarnings("unused")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             out.println("<html>");
            out.println("<head>");
           out.println("<title>Inbox Mail Page</title>");
            out.println("</head>");
            out.println("<body>");

                            //HttpSession session=request.getSession(false);
            HttpSession session=request.getSession(false);
            if(session.isNew())
              out.println("<br/>New Session");
            else
              out.println("<br/>OLD Session");

            if(request.isRequestedSessionIdFromCookie())
                out.println("<br/>Session ID from Cookie");
            else
                out.println("<br/>Session ID not From Cookie");
            String composingUser=(String)session.getAttribute("UN");
            String composingUserPass=(String)session.getAttribute("UP");


            out.println("<hr>Authentication Successful<hr>");
            out.println("Welcome "+composingUser+" !!!");
            out.println("<h1>Inbox Mail page </h1>");
 
            out.println("<H4>Information on Your Session:</H4>\n" +
                    "<TABLE BORDER=1 ALIGN=CENTER>\n" +
                    "<TR BGCOLOR=\"#FFAD00\">\n" +
                    "  <TH>Info Type<TH>Value\n" +
                    "<TR>\n" +
                    "  <TD>ID\n" +
                    "  <TD>" + session.getId() + "\n" +
                    "<TR>\n" +
                    "  <TD>Creation Time\n" +
                    "  <TD>" + new Date(session.getCreationTime()) + "\n" +
                    "<TR>\n" +
                    "  <TD>Time of Last Access\n" +
                    "  <TD>" + new Date(session.getLastAccessedTime()) + "\n" +
                    "<TR>\n");
            
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
