/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet6Address;
import java.net.InetAddress;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
         
            out.println("<html>");
            out.println("<head>");
            out.println("<title>I am First Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>First Serlvet</h1>");
            out.println("<hr/>");

            
            String ipAddress = request.getHeader("X-FORWARDED-FOR");  
            if (ipAddress == null) {  
         	   ipAddress = request.getRemoteAddr();  
            }
            
            
            String remoteAddress = request.getRemoteAddr();
            InetAddress inetAddress = InetAddress.getByName(remoteAddress);
            if (inetAddress instanceof Inet6Address) {    
            	 out.println("Visitor is using IPv6 <br/>");
            } else {
            	 out.println("Visitor is using IPv4 <br/>");
            }
            
            String clinetMachineName= request.getLocalName();
            String clinetMachineIP= ipAddress;//request.getRemoteAddr();
            

            out.println("Your Machine Name is"+ clinetMachineName +"<br/>");
            out.println("Your IP address is"+ clinetMachineIP +"<br/>");
            out.println("<hr/>");
            
            ServletContext context=getServletContext();
            context.setAttribute("MName",clinetMachineName);
            context.setAttribute("MIP",clinetMachineIP);
            out.println("<a href='SecondServlet'>Proceed to SecondServlet </a>");
            
            out.println("<hr/>");
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
