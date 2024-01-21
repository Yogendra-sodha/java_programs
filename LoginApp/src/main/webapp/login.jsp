<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form name = "lg" action = "/LoginApp/LoginServlet" method="post" onSubmit="return validateSubmit()">
		User Name <input name = "userName"/><br>
		Password <input type="password" name = "password"/><br>
		<input type ="submit" value = "Sign-in">
	</form>
	<p1>New user <a href="Register.jsp">Register</a></p1>
</body>
<script>
	function validateSubmit(){
		var u1 = document.lg.name.value;
		var ps = document.lg.password.value;
		if (u1 == "" || ps == ""){
			alert("fields cannot be empty");
			return false;
		}
		return true;	
	}
</script>
</html>