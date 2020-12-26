<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h3>Student Form</h3>
	<form:form action="/register" method="POST" modelAttribute="user">


		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
            				<td>Email</td>
            				<td><form:input path="email" /></td>
            			</tr>
            <tr>
            				<td>Phone Number</td>
            				<td><form:input path="phoneNo" /></td>
            			</tr>
            <tr>
            				<td>DOB</td>
            				<td><form:input path="Dob" /></td>
            			</tr>



			<tr>
				<td>Student Gender</td>
				<td><form:radiobuttons path="gender" items="${genders}" />
				</td>
			</tr>
			<tr>
				<td>Select Country</td>
				<td><form:select path="country">
						<form:options items="${countries}" />
					</form:select></td>
			</tr>

			<tr>
            				<td>Select State</td>
            				<td><form:select path="state">
            						<form:options items="${states}" />
            					</form:select></td>
            			</tr>

			<tr>
                        				<td>Select City</td>
                        				<td><form:select path="city">
                        						<form:options items="${cities}" />
                        					</form:select></td>
                        			</tr>


			<tr>
				<td>Register</td>
				<td><input type="submit" value="Submit"/>
			</tr>
		</table>


	</form:form>
</body>
</html>