<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
   <%
        int i=Integer.parseInt(request.getParameter("num1"));
        int j=Integer.parseInt(request.getParameter("num2"));
        int k=i+j;
        out.println("output:" +k);
    
    %>

</body>
</html>


<% /* There are four tgs in jsp 
  1.Directives - importstatements in servlet.
 2.declerations - inside main class out side method. 
 3.scriplets - inside main method.                   
 4.expressions - print line statements  */ %>