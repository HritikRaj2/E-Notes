<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<%@include file="all_components/allcss.jsp"%>
<style type="text/css">
.back-img {
	background: url("img/backg.jpg");
	width: 100%;
	height: 80vh;
	background-repeat: no-repeat;
	background-size: cover;
}

.text-center {
	padding-top: 85px;
}
</style>
</head>
<body>
	<%@include file="all_components/navbar.jsp"%>
	<%@ page import="com.Db.DBConnect" %>
	<%@ page import="java.sql.Connection" %>
	
	<%
	DBConnect c=new DBConnect();
	System.out.println(c);
	%>
	<div class="container-fluid back-img">
		<div class="text-center">
			<h1 class="text-white">
				<i class="fa fa-book" aria-hidden="true"></i>E Notes-Save Your Notes
			</h1>
			<a href="login.jsp" class="btn btn-light"><i
				class="fa fa-user-circle-o" aria-hidden="true"></i>Login</a> <a
				href="register.jsp" class="btn btn-light"><i
				class="fa fa-user-plus" aria-hidden="true"></i>Register</a>
		</div>
	</div>
	<%@include file="all_components/footer.jsp"%>

</body>
</html>