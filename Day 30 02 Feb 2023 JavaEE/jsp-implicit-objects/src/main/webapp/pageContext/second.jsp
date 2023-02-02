<html>
<body>
	<%
		String name = (String) pageContext.getAttribute("user",PageContext.SESSION_SCOPE);
		out.print("Hello " + name);
	%>
</body>
</html>