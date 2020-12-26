<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>

		<tr>
			<td>user Name :</td>
			<td>${user.firstName}</td>
		</tr>
		<tr>
        			<td>user Name :</td>
        			<td>${user.lastName}</td>
        </tr>

		<tr>
			<td>user Gender :</td>
			<td>${user.email}</td>
		</tr>

		<tr>
			<td>Course Name :</td>
			<td>${user.phoneNo}</td>
		</tr>

		<tr>
        			<td>Course Name :</td>
        			<td>${user.dob}</td>
        		</tr>
        		<tr>
                			<td>Course Name :</td>
                			<td>${user.gender}</td>
                		</tr>
                		<tr>
                        			<td>Course Name :</td>
                        			<td>${user.country}</td>
                        		</tr>
                        		<tr>
                                                        			<td>Course Name :</td>
                                                        			<td>${user.state}</td>
                                                        		</tr>
                                                        		<tr>
                                                                                        			<td>Course Name :</td>
                                                                                        			<td>${user.city}</td>
                                                                                        		</tr>

	</table>

	<a href="loadForm">Go Back</a>
</body>
</html>