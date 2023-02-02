package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final String userID = "admin";
	private final String password = "admin";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get request parameters for userID and password
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		if (userID.equals(user) && password.equals(pwd)) {
			//public Cookie(String name, String value) {
			Cookie loginCookie = new Cookie("user", user);
			// setting cookie to expiry in 30 mins
			// @param expiry an integer specifying the maximum age of the
			// cookie in seconds; if negative, means the cookie is not stored;
			// if zero, deletes the cookie
			loginCookie.setMaxAge(30 * 60);
			// Store cookie in client side browser folders.. each browser has different
			// mechanism to store cookies, chrome uses SQLLite DB to store cookies
			response.addCookie(loginCookie);
			response.sendRedirect("LoginSuccess.jsp");
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/cookies.html");
			PrintWriter out = response.getWriter();
			out.println("<font color=red>Either user name or password is wrong.</font></br>");
			rd.include(request, response);
		}

	}

}