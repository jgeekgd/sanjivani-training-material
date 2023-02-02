<html>
<body>
	<%
		String name = (String) session.getAttribute("user");
		out.print("Hello " + name);
	%>
</body>
</html>