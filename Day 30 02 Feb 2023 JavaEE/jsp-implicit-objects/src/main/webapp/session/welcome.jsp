<html>
<body>
	<% 

	String name=request.getParameter("uname");
	out.print("Welcome "+name);
	session.setAttribute("user",name);
	%>
	<a href="second.jsp">second jsp page</a>
</body>
</html>