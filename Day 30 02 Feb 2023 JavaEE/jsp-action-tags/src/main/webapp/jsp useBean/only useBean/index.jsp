
<jsp:useBean id="obj" class="myexample.Calculator" />
<%
	int m = obj.cube(5);
	out.print("cube of 5 is " + m);
%>
