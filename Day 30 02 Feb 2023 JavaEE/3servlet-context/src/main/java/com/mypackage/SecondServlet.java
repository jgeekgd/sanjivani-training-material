/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mypackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.support.MyDateTime;

 
public class SecondServlet extends HttpServlet {
    
 
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
         
            out.println("<html>");
            out.println("<head>");
            out.println("<title>I am Second Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Second Serlvet</h1>");
            out.println("<hr/>");
            ServletContext context=getServletContext();
            String whoWasUser=(String)context.getAttribute("MName"); //returns object
            String whatWasIP=(String)context.getAttribute("MIP");
            
            out.println("I still Know client Machine Name is"+ whoWasUser +"<br/>");
            out.println("I still Know client IP address is"+ whatWasIP +"<br/>");
            out.println("<hr/>");

            String filename=getInitParameter("RecorderFile");
            if(filename!=null)
            {
                PrintWriter pw =new PrintWriter(new FileWriter(filename,true));
                try
                {
                pw.print("User Machine Name:"+whoWasUser+",");
                pw.print("User Machine IP:"+whatWasIP+",");
                pw.print("Last Accessed Time:"+MyDateTime.getDateTime()+".");
                pw.println();
                }
                finally
                {
                    if(pw!=null)
                    {
                        pw.close();
                    }
                }

            }
            out.println("<hr/>");
            out.println("I Recored your Access Details for security measures");
           } finally 
           {
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
