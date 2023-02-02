<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>

	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuAdmin.jsp"></jsp:include>

	<h3>User Details</h3>

	<p style="color: red;">${errorString}</p>

	<table border="1" cellpadding="5" cellspacing="1">
		<tr>
			<th>Login Name</th>
			<th>Password</th>
			<th>Role</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.userLogin}</td>
				<td>${user.userPass}</td>
				<td>${user.role}</td>
				<td><a href="editUser?id=${user.userLogin}">Edit</a></td>
				<td><a href="deleteUser?id=${user.userLogin}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

	<p>
		<a href="addUser">Add New User</a>
	</p>
	<jsp:include page="../_footer.jsp"></jsp:include>

</body>
</html>