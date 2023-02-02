package com.gd.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = -3816766509719300121L;

	public LogOut() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("userIs")!=null) {
			session.invalidate();
			request.setAttribute("logOutString", "Logged out successfully");
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/_login.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("logOutString", "");
			getServletContext().getRequestDispatcher("/WEB-INF/views/homes/_homeDefault.jsp").forward(request, response);;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
