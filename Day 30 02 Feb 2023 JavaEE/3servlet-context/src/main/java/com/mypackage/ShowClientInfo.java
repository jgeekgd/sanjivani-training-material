package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ShowClientInfo extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {

                PrintWriter out = response.getWriter();
                response.setContentType("text/html");

                Locale locale = request.getLocale();
                String localeName = request.getLocalName();
                String localeAddress = request.getLocalAddr();
                String protocol = request.getProtocol();
                String method = request.getMethod();
                String queryString = request.getQueryString();
                String countryName = locale.getCountry();
                String language = locale.getLanguage();
                //String param = request.getParameter("");
                @SuppressWarnings("unused")
				Map<String, String[]> paramMap = request.getParameterMap();
                Enumeration<String> params = request.getParameterNames();

                out.println("localeName- " + localeName);
                out.println("<br>localeAddress- " + localeAddress);
                out.println("<br>protocol- " + protocol);
                out.println("<br>method- " + method);
                out.println("<br>queryString- " + queryString);
                out.println("<br>Country- " + countryName);
                out.println("<Br>Language- " + language);

                while(params.hasMoreElements()){
                        out.print("<BR>Parameter- "+params.nextElement());      
                }
                
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                doGet(request, response);
        }
}