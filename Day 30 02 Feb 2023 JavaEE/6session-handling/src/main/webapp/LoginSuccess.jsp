<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Success Page</title>
</head>
<body style="font-family: Rockwell, Segoe UI, serif;">
	<!-- The code written inside &lt;%....%&gt; JSP file is called as Scriptlet  -->
	<%
	String userName = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("user"))
			userName = cookie.getValue();
		}
	}
	if (userName == null)
		response.sendRedirect("cookies.html");
	%>

	Hi
	<%=userName%>, 
	<br>
	Login successful.

	<br>
	<form action="LogoutServlet" method="post">
		<input type="submit" value="Logout">
	</form>
</body>
</html>