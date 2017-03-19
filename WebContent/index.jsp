<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Trang chu</title>

</head>
<body>
	<nav class="navbar navbar-default">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Trang chu</a>
		</div>

		<!-- CHINH SUA CAC DIA CHI DUOI DAY -->
		
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class=""><a href="./them-sinh-vien-action.do">Thêm mới
						<span class="sr-only">(current)</span>
				</a></li>
				<li><a href="./liet-ke-action.do">Liệt kê cơ bản</a></li>
				<li><a href="./liet-ke-nang-cao-action.do">Liệt kê nâng cao</a></li>
			</ul>
		</div>
	</div>
	</nav>
</body>
</html>