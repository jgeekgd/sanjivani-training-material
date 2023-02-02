<html>
<body>
	<%
		out.print("Welcome " + request.getParameter("uname"));
	%>
	<br/>
	<%
		String driver = config.getInitParameter("dname");
		out.print("Driver name is :" + driver);
	%>
</body>
</html>