<jsp:useBean id="u" class="myexample.User"></jsp:useBean>
<%
	String name = "arjun";
%>
<jsp:setProperty property="name" name="u" value="<%=name%>" />

Record:
<br>
<jsp:getProperty property="name" name="u" /><br>