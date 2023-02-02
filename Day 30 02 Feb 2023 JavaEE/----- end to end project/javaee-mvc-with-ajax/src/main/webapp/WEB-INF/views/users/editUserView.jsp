<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User</title>
</head>
<body>

	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuAdmin.jsp"></jsp:include>

	<h3>Edit User</h3>

	<p style="color: red;">${errorString}</p>

	<c:if test="${not empty editUser}">
		<form method="POST" action="doEditUser">
			<input type="hidden" name="loginId" value="${editUser.userLogin}" />
			<table border="0">
				<tr>
					<td>Login Id</td>
					<td style="color: red;">${editUser.userLogin}</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password"
						value="${editUser.userPass}" /></td>
				</tr>
				<tr>
					<td>Role</td>
					<td><select name="role">
							<option value="normal">Normal User</option>
							<option value="admin">Admin</option>
					</select></td>

				</tr>
				<tr>
					<td><input type="submit" value="Submit" />
					<td><input type="reset" name="rest" value="Reset" /></td>
				</tr>
			</table>
		</form>
	</c:if>

	<jsp:include page="../_footer.jsp"></jsp:include>

</body>
</html>