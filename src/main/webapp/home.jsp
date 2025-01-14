<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.back-img {
	background: url("img/homeback.jpg");
	width: 100%;
	height: 85vh;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<%@include file="all_components/navbar.jsp"%>
	<div class="back-img">
		<a href="login.jsp" class="btn btn-light"><i
			class="fa fa-user-circle-o" aria-hidden="true"></i>Start</a>
	</div>
	<%@include file="all_components/footer.jsp"%>
</body>
</html>