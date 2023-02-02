package com.gd.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bnymellon.lnd.jdbc.dao.UserDao;
import com.bnymellon.lnd.jdbc.dao.impl.UserDaoImpl;
import com.bnymellon.lnd.jdbc.model.User;

@WebServlet(urlPatterns = { "/editUser" })
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 4645721142572801101L;
	private UserDao userDao = new UserDaoImpl();

	public EditUser() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = (String) request.getParameter("id");

		User editUser = null;
		editUser = userDao.findUser(userId);
		request.setAttribute("editUser", editUser);
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/users/editUserView.jsp");
		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}