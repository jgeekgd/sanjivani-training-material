<html>
<body>

	<%
		out.print("Today is:" + java.util.Calendar.getInstance().getTime());
	%>
	<br/>
	<br/>
	Parameter Value is :<%=request.getParameter("name")%>
	<br/>
	<br/>
	<br/>Check the URL too
</body>