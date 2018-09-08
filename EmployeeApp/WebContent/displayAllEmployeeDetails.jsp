<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee Details</title>
</head>
<body>
	<h1>Employee Details</h1>
	<hr><br>
	<table border="1">
		<tr>
		     <th>Employee Id</th>
		     <th>Employee Name</th>
		     <th>Employee Salary</th>
		     <th>Employee Department</th>
		         <th>Delete</th>
		         <th>Edit</th>
		</tr>
		<c:forEach var="employee" items="${requestScope.employeesList}">
			<tr>
			    <td>${employee.emoloyeeId}</td>
			    <td>${employee.employeeName}</td>
			    <td>${employee.employeeSalary}</td>
			    <td>${employee.employeeDepartment}</td>		
			    <td><a href="updateemployee?empId=${employee.emoloyeeId}">Edit</a></td>	
			   <td> <a href="deleteemployee?empId=${employee.emoloyeeId}">delete</a> </td>   
			</tr>
		</c:forEach>		
	</table>
</body>
</html>