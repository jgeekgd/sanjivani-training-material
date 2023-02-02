<html>
<head>
<title>Include Directive JSP Page.</title>
</head>
<body>
	<%@include file="header.jsp"%><br />
	<font size="10"><%="Hello World!"%></font>
	<br />
	<jsp:include page="footer.jsp" />
</body>
</html>
