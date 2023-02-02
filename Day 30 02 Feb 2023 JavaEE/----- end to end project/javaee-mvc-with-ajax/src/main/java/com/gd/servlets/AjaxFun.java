package com.gd.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 * Servlet implementation class AjaxFun
 */
@WebServlet("/ajaxfun")
public class AjaxFun extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao = new UserDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjaxFun() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/users/userListView_Ajax.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		String searchForThisEnteredId = request.getParameter("searchThisEnteredValue");
		System.out.println(searchForThisEnteredId);
		
		if (searchForThisEnteredId != "") {
			List<User> foundUsers = userDao.findAllUsersByLoginIdPattern(searchForThisEnteredId);
			// System.out.println(foundUsers.size());

			out.println("<br/>");
			out.println("<br/>");
			if (foundUsers.size() > 0) {
				out.println("<table border=\"1\" cellpadding=\"5\" cellspacing=\"1\">");
				out.println("<tr>");
				out.println("<th>Login Name</th>");
				out.println("<th>Password</th>");
				out.println("<th>Role</th>");
				out.println("<th>Edit</th>");
				out.println("<th>Delete</th>");
				out.println("</tr>");

				for (User user : foundUsers) {
					out.println("<tr>");
					out.println("<td>" + user.getUserLogin() + "</td>");
					out.println("<td>" + user.getUserPass() + "</td>");
					out.println("<td>" + user.getRole() + "</td>");
					out.println("<td><a href=editUser?id=" + user.getUserLogin() + ">Edit</a></td>");
					out.println("<td><a href=deleteUser?id=" + user.getUserLogin() + ">Delete</a></td>");
					out.println("</tr>");
				}
			} else {
				out.println("<table border=\"1\" cellpadding=\"5\" cellspacing=\"1\">");
				out.println("<tr>");
				out.println("<th>No user found with that id</th>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.close();
		}
	}
}
