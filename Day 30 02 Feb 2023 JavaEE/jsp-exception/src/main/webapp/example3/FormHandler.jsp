<%@ page errorPage="ExceptionHandler.jsp" %>
<html>
<head>
    <style type="text/css">
       body, p { font-family:Tahoma; font-size:10pt; }
       </style>
</head>
<body>

<%-- Form Handler Code --%>
<%
       int age;
       age = Integer.parseInt(request.getParameter("age"));
%>

<%-- Displaying User Age --%>
<p>Your age is : <%= age %> years.</p>

<p><a href="Form.html">Back</a>.</p>

</body>
</html>
