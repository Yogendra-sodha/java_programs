<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<form name = "rf" action = "/LoginApp/RegisterServlet" method="post" onSubmit="return validatePass(event);">
		Name <input name = "name"/><br>
		User Name <input name = "userName"/><br>
		Password <input type="password" name = "password"/><br>
		Confirm Password <input type="password" name = "rePassword"/><br>
		<input type ="submit" value = "Sign-in">
	</form>
	<p1>User<a href="login.jsp">Already User?</a></p1>
</body>
<script>
	function validatePass(event){
		var p1 = document.rf.password.value;
		var p2 = document.rf.rePassword.value;
		console.log(p1);
		console.log(p2);
		if (p1 != p2){
			alert("Password not matching");
			return false;
		}
		return true;
	}
</script>
</html>