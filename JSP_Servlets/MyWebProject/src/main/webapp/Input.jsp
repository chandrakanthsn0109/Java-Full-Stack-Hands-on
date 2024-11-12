<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Factorial Table Input</title>
</head>
<body>
    <h2>Enter a Number to Get Its Factorial Table</h2>
    <form action="Output.jsp" method="get">
        <label for="number">Number:</label>
        <input type="text" id="number" name="number" required>
        <button type="submit">Submit</button>
    </form>
</body>
</html>