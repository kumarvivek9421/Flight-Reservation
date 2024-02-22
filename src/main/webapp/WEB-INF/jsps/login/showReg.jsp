<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
	<h2>Create New Account</h2>
	<form action="saveReg" method="post">
		<table>
			<tr>
				<td>first name</td>
				<td><input type="text" name="firstName" placeholder="Enter here" /></td>
			</tr>
			<tr>
				<td>last name</td>
				<td><input type="text" name="lastName" placeholder="Enter here" /></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email" placeholder="Enter here" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="password" placeholder="Enter here" /></td>
			</tr>
		</table>
		<input type="submit" value="save"/>
	      <input type="submit" value="clear"/>
	</form>
</body>
</html>