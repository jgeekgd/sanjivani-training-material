package com.gd.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bnymellon.lnd.jdbc.dao.UserDao;
import com.bnymellon.lnd.jdbc.dao.impl.UserDaoImpl;
import com.bnymellon.lnd.jdbc.model.User;

@WebServlet(urlPatterns = { "/doEditUser" })
public class DoEditUser extends HttpServlet {
	private static final long serialVersionUID = 4645721142572801104L;
	private UserDao userDao = new UserDaoImpl();

	public DoEditUser() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String loginId = (String) request.getParameter("loginId");
		String passowrd = (String) request.getParameter("password");
		String role = (String) request.getParameter("role");

		User editUser = new User(loginId, passowrd, role);
		userDao.update(loginId, editUser);
		response.sendRedirect(request.getContextPath() + "/userList");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}