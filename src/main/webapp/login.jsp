<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="StyleSheet" href="css/style.css">
<meta charset="UTF-8">
<title>Login Page</title>
<style type="text/css">
.backg {
    background-image: linear-gradient(to right top, #513344, #664a6c, #6c6699, #5b87c6, #12abeb);
    height: 90vh; /* Full-screen height */
    display: flex; /* Use Flexbox for centering */
    justify-content: center; /* Center horizontally */
    align-items: center; /* Center vertically */
    background-repeat: no-repeat;
	background-size: cover
}

/* Login Box Styling */
.login-box {
    background-color: white;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); /* Add shadow for better look */
    width: 100%;
    max-width: 400px; /* Set maximum width for responsiveness */
    text-align: center; /* Center text inside the box */
    margin-top:-13px;
}

.login-box h1 {
    font-size: 24px;
    margin-bottom: 20px;
    color: #333;
}

.login-box input[type="text"],
.login-box input[type="password"] {
    width: 100%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #f9f9f9;
}

.login-box button {
    width: 100%;
    padding: 10px;
    background-color: #04AA6D;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
}

.login-box button:hover {
    background-color: #028a57;
}
.logooo{
height:20px}
</style>
</head>
<body>
    <%@include file="all_components/navbar.jsp"%>
    <div class="backg">
        <div class="login-box">
        
            <h1>Login</h1>
            <form action="loginServlet" method="post">
                <input type="text" name="uemail" placeholder="Username or E-mail" required>
                <input type="password" name="upassword" placeholder="Password" required>
                <button type="submit">Login</button>
            </form>
        </div>
    </div>
    <%@include file="all_components/footer.jsp" %>
    
</body>
</html>
