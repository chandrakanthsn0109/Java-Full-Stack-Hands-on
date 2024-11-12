<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<form action="EmployeeController" method="post" class="container">
<center><h1>Employee Management System</h1><br></center>

<div class="col-sm-7" style="margin-left:20%">
<label>Enter Employee Id:</label>
<input type="text" name="eid" class="form-control" ><br></div>

<div class="col-sm-7" style="margin-left:20%">
<label>Enter Employee Name:</label>
<input type="text" name="ename" class="form-control" ><br></div>

<div class="col-sm-7" style="margin-left:20%">
<label>Enter Employee Salary:</label>
<input type="text" name="esal" class="form-control" ><br></div>
<div class="col-sm-7" style="margin-left:20%">
<center><input type="submit" value="Insert" name="btn" class="btn btn-primary">
<input type="submit" value="Update" name="btn" class="btn btn-success">
<input type="submit" value="Delete" name="btn" class="btn btn-danger">
<input type="submit" value="Find" name="btn" class="btn btn-info">
<input type="submit" value="FindAll" name="btn" class="btn btn-warning"></center>
</div>
</form>
</body>
</html>