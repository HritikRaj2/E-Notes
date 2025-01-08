<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Navbar</title>
<link rel="stylesheet" href="nav.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: Arial, Helvetica, sans-serif;
}

body {
	background-color: #f4f4f4;
}

.divHeader {
	background-color: #2c3e50;
	box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
}

.divheaderitems {
	display: flex;
	align-items: center;
	justify-content: space-between;
	max-width: 1200px;
	margin: 0 auto;
	padding: 10px 20px;
	height: 60px;
}

.divheaderitems a {
	color: white;
	text-decoration: none;
	padding: 10px 15px;
	transition: background-color 0.3s ease, color 0.3s ease;
	display: flex;
	align-items: center;
	gap: 8px;
}

.divheaderitems a:hover {
	background-color: darkblue;
	border-radius: 5px;
}

.logo {
	font-size: 24px;
	font-weight: bold;
}

.links {
	display: flex;
	gap: 15px;
}

.auth {
	display: flex;
	gap: 15px;
}

.fa {
	margin-right: 5px;
}

.left-section {
	display: flex;
	gap: 15px;
	align-items: center;
}

.right-section {
	display: flex;
	gap: 15px;
	margin-left: auto;
}

@media ( max-width : 768px) {
	.divheaderitems {
		flex-wrap: wrap;
		justify-content: center;
	}
	.divheaderitems .links, .divheaderitems .auth {
		flex-wrap: wrap;
		justify-content: center;
		gap: 10px;
	}
	.divheaderitems a {
		padding: 8px 12px;
		font-size: 14px;
	}
	.logo {
		font-size: 20px;
	}
}
</style>
</head>
<body>
	<div class="divHeader">
		<div class="divheaderitems">
			<div class="left-section">
				<a class="logo" href="index.jsp">E-Notes</a> <a href="index.jsp"><i
					class="fa fa-home"></i> Home</a> <a href=""><i class="fa fa-plus"></i>
					Add Notes</a> <a href=""><i class="fa fa-sticky-note"></i> Show
					Notes</a> <a href=""><i class="fa fa-phone"></i> Contact</a>
			</div>
			<div class="right-section auth">
				<a href="login.jsp"><i class="fa fa-sign-in"></i> Login</a> 
				<a href="register.jsp"><i class="fa fa-user-plus"></i> Register</a>
			</div>
		</div>
	</div>
</body>
</html>