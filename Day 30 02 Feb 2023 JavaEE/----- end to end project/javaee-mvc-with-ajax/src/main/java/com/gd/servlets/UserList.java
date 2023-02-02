package com.gd.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bnymellon.lnd.jdbc.dao.UserDao;
import com.bnymellon.lnd.jdbc.dao.impl.UserDaoImpl;
import com.bnymellon.lnd.jdbc.model.User;

@WebServlet("/userList")
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao = new UserDaoImpl();

	public UserList() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String errorString = null;
		List<User> allUsers = null;

		allUsers = userDao.allUsers();

		// Store info in request attribute, before forward to views
		request.setAttribute("errorString", errorString);
		request.setAttribute("userList", allUsers);

		// Forward to /WEB-INF/views/productListView.jsp
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/users/userListView_Ajax.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
