package com.revture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count;

	@Override
	public void init() {
		System.out.println("======================init() Method Called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String s1 = request.getParameter("N");
		String age = request.getParameter("A");
		out.println("Welcome : " + s1 + "<BR>");
		out.println("Your age is  : " + age + "<BR>");
		++count;
		out.println("<body style='text-align: center;font-family: cursive;font-size: xx-large;'>");
		out.println("You are the  " + count + " visitor<br><br>");
		out.println("<A href='index.html'> Click Here to Change </A><br>");
		out.print(String.format("<a href=\"%s/index.html\">Alternate Link</a>", getServletContext().getContextPath()));
		out.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("======================destroy() Method Called");
	}
}
