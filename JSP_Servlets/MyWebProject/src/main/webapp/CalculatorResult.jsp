<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="Calculator.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String requestFrom = request.getParameter("btn");

int n1 = Integer.parseInt(request.getParameter("n1"));
int n2 = Integer.parseInt(request.getParameter("n2"));

if(requestFrom.equals("Addition")){
	out.println("<br>Addition : " + (n1 + n2));
}
if(requestFrom.equals("Subtraction")){
	out.println("<br>Subtraction : " + (n1 - n2));
}
if(requestFrom.equals("Multiplication")){
	out.println("<br>Multiplication : " + (n1 * n2));
}
if(requestFrom.equals("Division")){
	out.println("<br>Division : " + (n1 / n2));
}
%>
</body>
</html>