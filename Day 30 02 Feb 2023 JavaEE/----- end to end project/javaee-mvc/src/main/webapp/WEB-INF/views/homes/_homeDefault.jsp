<%@page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>
<body>
	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuDefault.jsp"></jsp:include>
	<h3>Hello There</h3>
	This is sample JDBC demo using jsp, servlet 
	<br>
	<b>It includes the following functions:</b>
	<ul>
		<li>Login</li>
		<li>Log Out</li>
		<li>Create User</li>
		<li>Edit User</li>
		<li>Delete User</li>
	</ul>
	<jsp:include page="../_footer.jsp"></jsp:include>
</body>
</html>
