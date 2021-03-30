<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSERT ALL DOCUMENTS FOR JOINING</title>
</head>
${data }
<h3 style="color: green ;text-align: center">${value.name }</h3>
<h1 style="color: red ;text-align: center;">INSERT ALL DOCUMENTS FOR JOINING</h1>
<body >
<div align="center">
<form action="/register" method="post" >

<table>
<tr><td>Candiate Name::</td>
<td><input type="text" name="name">
</tr>

<tr><td>Password::</td>
<td><input type="password" name="pws">
</tr>

<tr><td>Email::</td>
<td><input type="email" name="email">
</tr>

<tr><td>Phone Number::</td>
<td><input type="number" name="phn">
</tr>

<tr><td></td>
<td><input type="submit" value="Register"/></td>
</tr>

</table>

</div>

</form>

</body>
</html>