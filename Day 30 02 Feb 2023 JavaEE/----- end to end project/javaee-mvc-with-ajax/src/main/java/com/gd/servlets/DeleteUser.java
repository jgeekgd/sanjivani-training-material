package com.gd.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bnymellon.lnd.jdbc.dao.UserDao;
import com.bnymellon.lnd.jdbc.dao.impl.UserDaoImpl;

@WebServlet(urlPatterns = { "/deleteUser" })
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 4645721142572801106L;
	private UserDao userDao = new UserDaoImpl();

	public DeleteUser() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = (String) request.getParameter("id");
		userDao.remove(userId);
		response.sendRedirect(request.getContextPath() + "/userList");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}