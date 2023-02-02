<html>
<body>
	<%
		String s=request.getParameter("uname");
		response.sendRedirect("http://www."+s+".com");
	%>
</body>
</html>