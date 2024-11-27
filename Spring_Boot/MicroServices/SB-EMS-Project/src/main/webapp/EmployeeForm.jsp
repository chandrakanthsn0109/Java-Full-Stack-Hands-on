<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form action="employee-data">
<h4>Enter ID:</h4><input type="text" name="eid" class="form-control"/><br><br>
<h4>Enter Name:</h4><input type="text" name="ename" class="form-control"/><br><br>
<h4>Enter Salary:</h4><input type="text" name="esalary" class="form-control"/><br><br>
<center>
<input type="submit" value="Insert" name="btn" class="btn btn-primary"/>&nbsp&nbsp
<input type="submit" value="Update" name="btn" class="btn btn-success"/>&nbsp&nbsp
<input type="submit" value="Delete" name="btn" class="btn btn-danger"/>&nbsp&nbsp
<input type="submit" value="Find" name="btn" class="btn btn-warning"/>&nbsp&nbsp

</form>
<form action="find-all">
<input type="submit" value="FindAll" name="btn" class="btn btn-info"/>&nbsp&nbsp
</form>
</center>

</div>
</body>
</html>