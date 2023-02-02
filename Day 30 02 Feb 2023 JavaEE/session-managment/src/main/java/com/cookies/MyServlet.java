package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter(); 
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        if(pass.equals("1234"))
        {
            Cookie ck = new Cookie("username",name);
            out.println("Hi Viewr	's<br>");
            ck.setDomain("localhost");
            String s = ck.getDomain();
            out.println("Domain is : "+s+"<br>");
            ck.setMaxAge(1000);
            out.println("Maximum age of cookies is "+ck.getMaxAge()+" sec <br>");
            //change name username here
            ck.setValue("Amit");
            out.println("Set value = "+ck.getValue());
            ck.setSecure(true);
            out.println("<br>Cookies is sent using secure protocols : "+ck.getSecure()+"<br>");
            response.addCookie(ck);
            out.println("<a href='First'>Read All Cookies</a>");
            
        }
    }
}

//Chrome
//C:\Users\GangadharParde\AppData\Local\Google\Chrome\User Data\Default\Network\

