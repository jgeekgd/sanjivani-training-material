<%@ page language="Java" import="java.sql.*" %>

<html>
    <head><title>JSP with Javabeans</title></head>

	<body bgcolor="#00ccff">
	<h3>JSP using JavaBeans example</h3>
    <form name="form1" method="POST">
    
		 ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		 <input type="text" name ="msgid"> <br>
		 Message<input type="text" name ="message"> <br>
		 <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		 <input type = "submit" value="save">
		 
		 
		 <jsp:useBean id="sample" class="myexample.Bean" scope="page">
			<jsp:setProperty name="sample" property="*"/>
		</jsp:useBean>
		
	</form>
	<% sample.insert();%>
</body>
</html>
 