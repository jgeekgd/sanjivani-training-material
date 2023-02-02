package com.urlrewriting;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet2 extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        String uid = request.getParameter("uid");
        String pass = request.getParameter("pass");
        
        if(pass.equals("1234"))
        {
	     //adding user id at the end of URL 	
             response.sendRedirect("First2?user_id="+uid+"");
        }
    }
}
