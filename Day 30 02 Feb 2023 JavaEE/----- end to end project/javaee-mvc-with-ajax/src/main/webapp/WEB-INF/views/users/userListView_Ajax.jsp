<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User List</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#loginId').keypress(function(e) {
			var regex = new RegExp("^[a-zA-Z0-9]+$");
			var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
			if (regex.test(str)) {
				return true;
			}
			e.preventDefault();
			return false;
		});
		$("#loginId").keyup(function(e) {
			var input = $('#loginId').val();
			searchString = "searchThisEnteredValue=" + input;
			$.ajax({
				type : "POST",
				url : "ajaxfun",
				data : searchString,
				success : function(response) {
					console.log(response);
					$('#magicHappensHere').html(response);
				}//function(response)
				,
				error : function(e) {
					alert('Error: ' + e);
				}//error:
			});//ajax
		}); //keydown()
	});//function()
</script>
</head>
<body>
	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuAdmin.jsp"></jsp:include>
	<h3>Search/Edit/Delete User Details By Login Id</h3>
	<p style="color: red;">${errorString}</p>
	<table border="0">
		<tr>
			<td>Enter Login Id <span style="color: red;font-size: 11px;">(Only Alphanumeric)</span></td>
			<td><input type="text" name="loginId" id="loginId" value="" /></td>
		</tr>
	</table>
	<div id="magicHappensHere">
	</div>
	<p><a href="addUser">Add New User</a></p>
	<jsp:include page="../_footer.jsp"></jsp:include>
</body>
</html>









