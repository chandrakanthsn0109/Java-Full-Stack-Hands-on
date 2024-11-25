<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="EMS.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String status = request.getParameter("status");

String msg = request.getParameter("msg");

if(status.equals("success")){
out.println("<br><center><font color=green><h3>" + msg + "<h3></font></b></center>");
}
if(status.equals("fail")){
out.println("<br><font color=red><b>" + msg + "</font></b>");
}
%>

</body>
</html>