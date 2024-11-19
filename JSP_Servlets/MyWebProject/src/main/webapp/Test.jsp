<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
<%-- Declaration Tag --%>
<%! 
 int a = 7, b = 3;
 String name = "Chandra";
%>

<%-- Scriplet Tag --%>
<%
   int sum = a + b;

   if(a > b){
	   out.println("A is Big");
	   
   }else{
	   out.println("B is Big");
   }
%>

<%-- Expression Tag --%>
<br>
Addition: <%= sum %>
<br>
Welcome <%= name %>
<br>
Today Date : <%= new Date() %>


</body>
</html>