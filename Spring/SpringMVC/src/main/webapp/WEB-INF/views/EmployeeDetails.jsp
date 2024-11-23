<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <!-- <%@ page isELIgnored="false" %> to tell the server don't  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>

<b>
Employee Id: ${employee.eid}<!-- Expression Language -->
<br>
Employee Name: ${employee.ename}
<br>
Employee Salary: ${employee.esalary}
</b>

</body>
</html>