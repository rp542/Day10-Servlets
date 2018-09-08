<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Details</title>
</head>
<body bgcolor=pink >
<h1>Update Employee Details</h1>
<hr>
<br><br>
<form action="updateemployee" method="post">
	<br><br><br>
		<label> Employee Id: </label>
		<input type="text" value="${employee.emoloyeeId }" name="empId" readonly>
		<br> <br>
		<label>Employee Name: </label> 
		<input type="text" name="empName"  size="15" required /> 
		<br> <br>
		<label> Employee Salary: </label> 
		<input type="number" name="empSalary" size="15" required /> 
		<br> <br>
		<label>Employee Department: </label> 
		<select name="empDept"required>
		<option value="">--Select--</option>
			<option value="IT">IT</option>
			<option value="HR">HR</option>
			<option value="ADMIN">ADMIN</option>
			<option value="ACCOUNTS">ACCOUNTS</option>
		</select>
		<br><br><br>
		<input type="submit" value="Update"/>
	</form>
</body>
</html>