<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: Green; text-align: center">${msg }</h1>
	<form:form action="/register" modelAttribute="domain" method="post">
		<h1 style="color: red; text-align: center">Insert All Data</h1>
		<div align="center"><table style="color: green"; >
			<tr>
				<td><h2>Enter Employee Name::</h2></td>
				<td><form:input path="emp_name" /></td>
			</tr>

			<tr>
				<td><h2>Enter Employee Address::</h2></td>
				<td><form:input path="emp_adds" /></td>
			</tr>

			<tr>
				<td><h2>Enter Employee Mobile::</h2></td>
				<td><form:input path="mob" /></td>
			</tr>

			<tr>
				<td><h2>Enter Employee Email Id::</h2></td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td><h2>Enter Employee Gender::</h2></td>
				<td>Male <form:radiobutton path="gender" value="M"/>  
                   Female <form:radiobutton path="gender" value="F"/> </td>
			</tr>
			
			<tr>
				<td><input type="submit" value="register"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>

		</table></div>

	</form:form>

</body>
</html>



