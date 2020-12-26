<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign in page</title>
</head>
<body>

		<h3>Sign In Here</h3>
	<form:form action="/signIn" method="POST" modelAttribute="user">


		<table>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" /></td>
			</tr>



			<tr>
				<td>Register</td>
				<td><input type="submit" value="Sign in"/>
			</tr>
		</table>
<a href="/loadRegForm">Sign Up</a>



	</form:form>
</body>
</html>