<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crop</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<form action="CropController" method="post" class="container">
<center><h1>Crop Harvest Management System</h1><br></center>

<div class="col-sm-7" style="margin-left:20%">
<label>Enter Crop Id:</label>
<input type="text" name="cid" class="form-control" ><br></div>

<div class="col-sm-7" style="margin-left:20%">
<label>Enter Crop Name:</label>
<input type="text" name="cname" class="form-control" ><br></div>

<div class="col-sm-7" style="margin-left:20%">
<label>Enter Crop Cultivation Period in months:</label>
<input type="text" name="cultper" class="form-control" ><br></div>
<div class="col-sm-7" style="margin-left:20%">
<label>Enter Crop Harvest Capacity in Kg:</label>
<input type="text" name="harcap" class="form-control"><br></div>
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