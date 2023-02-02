<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="menus/_menuDefault.jsp"></jsp:include>

	<h3>Login Page</h3>
	<p style="color: red;">${errorString}</p>
	<p style="color: blue;">${logOutString}</p>
	<form method="POST" action="validate">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName" value="n001${user.userLogin}" />
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" value="123${user.userPass}" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /> 
				<td><input type="reset" name="rest" value="Reset" /></td>
			</tr>
		</table>
	</form>
	<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>