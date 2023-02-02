<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	1.	The below is through JSP Scriptlet:
	<br/>---------------------------------------------------------------------
	<br />
	<%
		out.println("Your IP address is " + request.getRemoteAddr());
	%>w

	<br/>
	<jsp:scriptlet>out.println("Your IP address is " + request.getRemoteAddr());</jsp:scriptlet>
	<br/>---------------------------------------------------------------------
	
	<br/>
	
	
	
	<br/>
	2.	The below is through JSP Declaration:
	<br/>---------------------------------------------------------------------
	
	<%! int x = 22; %> 
	<%! int y=x*x; %>
	
	<br/>
	<%
		out.println("X is :" + x+" Y is :"+y);
	%>
	<br/>---------------------------------------------------------------------
	
	<br/>
	<br/>
	3.	The below is through JSP Expression:
	<br/>---------------------------------------------------------------------
	<br/>Today's date: <%= (new java.util.Date()).toLocaleString()%>
	<br/>---------------------------------------------------------------------
	
	<%-- This comment will not be visible in the page source --%>
	<br/><br/><%-- comment : A JSP comment. Ignored by the JSP engine.--%>  
	<br/><!-- comment : An HTML comment. Ignored by the browser.--> 
	
	
	<br/>
	<br/>
	<br/>---------------------------------------------------------------------
	<br/>JSP Directives:
	<br/>---------------------------------------------------------------------
	<br/>Directive 					Description 
	<br/>< % @ page ... % > 		Defines page-dependent attributes, such as scripting language, error page, and buffering requirements. 
	<br/>< % @ include ... % > 		Includes a file during the translation phase. 
	<br/>< % @ taglib ... % > 		Declares a tag library, containing custom actions, used in the page
	<br/>---------------------------------------------------------------------
	
	<br/>
	<br/>
	<br/>---------------------------------------------------------------------
	<br/>JSP Actions:
	<br/>---------------------------------------------------------------------
	<br/>Syntax 			Purpose 
	<br/>jsp:include 		Includes a file at the time the page is requested 
	<br/>jsp:useBean 		Finds or instantiates a JavaBean 
	<br/>jsp:setProperty 	Sets the property of a JavaBean 
	<br/>jsp:getProperty 	Inserts the property of a JavaBean into the output 
	<br/>jsp:forward 		Forwards the requester to a new page 
	<br/>jsp:plugin 		Generates browser-specific code that makes an OBJECT or EMBED tag for the Java plugin 
	<br/>jsp:element 		Defines XML elements dynamically.
	<br/>jsp:attribute 		Defines dynamically defined XML element's attribute. 
	<br/>jsp:body 			Defines dynamically defined XML element's body. 
	<br/>jsp:text 			Use to write template text in JSP pages and documents.
	<br/>---------------------------------------------------------------------
	
	<br/>
	<br/>
	<br/>---------------------------------------------------------------------
	<br/>JSP Implicit Objects:
	<br/>---------------------------------------------------------------------
	<br/>Objects 			Description 
	<br/>request 			This is the HttpServletRequest object associated with the request. 
	<br/>response 			This is the HttpServletResponse object associated with the response to the client. 
	<br/>out 				This is the PrintWriter object used to send output to the client. 
	<br/>session 			This is the HttpSession object associated with the request. 
	<br/>application 		This is the ServletContext object associated with application context. 
	<br/>config 			This is the ServletConfig object associated with the page. 
	<br/>pageContext 		This encapsulates use of server-specific features like higher performance JspWriters. 
	<br/>page 				This is simply a synonym for this, and is used to call the methods defined by the translated servlet class. 
	<br/>Exception 			The Exception object allows the exception data to be accessed by designated JSP.
	<br/>---------------------------------------------------------------------
	
	
</body>
</html>