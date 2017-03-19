<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
<meta charset="UTF-8">
<title>Them sinh vien</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

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
	<div class="container">
	<!-- TAT CA CAC property doi day phai duoc khai bao trong form class LietKeSinhVienNangCaoForm  -->

		<html:form action="/liet-ke-nang-cao-action" method="post"
			styleClass="form-admin-right">
			<div class="text-center row">
				<div class="col-lg-10">
					<html:text property="tuKhoa" styleClass="form-control"></html:text>

				</div>
				<div class="col-lg-2">
					<html:submit styleClass="btn btn-default">Tìm kiếm</html:submit>
				</div>
			</div>
		</html:form>

		<br>
		<br>
		<div class="table-responsive">
			<table class="table table-bordered table-hover table-striped"
				id="showall">
				<thead>
					<tr align="center">
						<th>So CMND</th>
						<th>Ho ten</th>
						<th>Ma nganh</th>
						<th>Ma truong</th>
						<th>Ma nganh cong ty</th>
						<th>Ten cong ty</th>
						<th>Thoi gian lam viec</th>
					</tr>
				</thead>
				<tbody>
					<!-- Chay vong lop voi arraylist sinhVienNangCaos
					Moi lan lap se lay ra 1 phan tu trong arraylist va gan no = item,
					vay nen khi gọi name = "item" va property = "soCMND" nghia la truy cap toi thuoc tinh
					soCMND cua item itme la 1 dong của arraylist, cung tuong ung voi 1 dong trong csdl
					 -->
					<logic:iterate name="lietKeSinhVienNangCaoForm" property="sinhVienNangCaos"
						id="item">
						<tr class="odd gradeX" align="center">
							<td class="maTaiSan"><bean:write name="item"
									property="soCMND" /></td>
							<td class="maTaiSan"><bean:write name="item"
									property="hoTen" /></td>
							<td class="maTaiSan"><bean:write name="item"
									property="maNganh" /></td>
							<td class="maTaiSan"><bean:write name="item"
									property="maTruong" /></td>
							<td class="maTaiSan"><bean:write name="item"
									property="maNganhCongTy" /></td>
							<td class="maTaiSan"><bean:write name="item"
									property="tenCongTy" /></td>
							<td class="maTaiSan"><bean:write name="item"
									property="thoiGianLamViec" /></td>
						</tr>
					</logic:iterate>
				</tbody>
			</table>
		</div>
	</div>
</body>

</html>