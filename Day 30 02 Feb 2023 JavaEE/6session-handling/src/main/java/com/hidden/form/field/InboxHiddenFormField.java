package com.hidden.form.field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class InboxHiddenFormField extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        out.println("<body style='font-family:Rockwell,Segoe UI,serif;'>");
        out.println("Inbox "+user+"!");
		out.println("</br></br><a href='index.html'>Back</a></br>");

        
    }
}