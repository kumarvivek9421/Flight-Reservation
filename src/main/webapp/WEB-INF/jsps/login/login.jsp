<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<h2>Login Here...</h2>
	${Error}
	<form action="verifyLogin" method="post">
		<pre>
		emailid<input type="text" name="emailid" placeholder="Enter here"/>
		password<input type="text" name="password" placeholder="Enter here"/>
				<input type="submit" value="login"/>
		</pre>
	</form>
	
</body>
</html>