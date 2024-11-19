<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 String userName = request.getParameter("uname");
 String password = request.getParameter("pwd");
 
 if(userName.equals("chandrasn") && password.equals("Chandra@7")){%>
 <jsp:forward page="LoginSuccess.jsp"></jsp:forward>
 <%
	 
 }
 else{%>
 <jsp:include page="Login.jsp"></jsp:include>
<% 
  out.println("<font color=red><b>Invalid UserName and Password </b></font>");
 }
%>
</body>
</html>