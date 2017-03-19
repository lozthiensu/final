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

		<!-- TAT CA CAC property doi day phai duoc khai bao trong form class ThemSinhVienForm  -->
		<html:form action="/them-sinh-vien-action" method="post"
			styleClass="form-admin-right">
			<div class="card-block">
				<div style="width: 48px; display: inline-block;">
					<i class="fa fa-user prefix" style="font-size: 2rem;"></i>
				</div>
				<html:errors property="loicmnd" />
				<div class="md-form">
					<label for="form3">So CMND</label>
					<html:text name="themSinhVienForm" property="soCMND"
						styleClass="form-control"></html:text>
					<!-- THONG BAO LOI SO CMND NEU BO TRONG -->
					<html:errors property="loiSoCMND" />
				</div>

				<div class="md-form">
					<label for="form2">Ho ten</label>
					<html:text property="hoTen" styleClass="form-control"></html:text>
				</div>

				<div class="md-form">
					<label for="form34">Email</label>
					<html:text property="email" styleClass="form-control"></html:text>
				</div>

				<div class="md-form">
					<label for="form8">So DT</label>
					<html:text property="soDT" styleClass="form-control"></html:text>
				</div>

				<div class="md-form">
					<label for="form8">Dia chi</label>
					<html:text property="diaChi" styleClass="form-control"></html:text>
				</div>
				<div class="md-form">
					<label for="form8">Ma truong</label>
					<html:select name="themSinhVienForm" property="maTruong">
						<logic:iterate name="themSinhVienForm" property="truongs"
							id="item">
							<bean:define id="id" name="item" property="maTruong" />
							<html:option value="${id}">
								<bean:write name="item" property="tenTruong" />
							</html:option>
						</logic:iterate>
					</html:select>
				</div>

				<!-- Cu phap kahi bao selectbox voi du lieu lay tu database -->
				<div class="md-form">
					<label for="form8">Ma nganh</label>

					<!-- Khi selectbox duoc chon, gia tri se duoc thiet lap cho thuoc tinh maNganh trong class form ThemSinhVien -->
					<html:select name="themSinhVienForm" property="maNganh">

						<!-- Vong lap nay de in ra danh sach cac nganh tu csdl
						neu de thay doi thi chu y nhung tu nao giong nhau neu thay doi thi phai thay doi theo -->
						<logic:iterate name="themSinhVienForm" property="nganhs" id="item">
							<bean:define id="id" name="item" property="maNganh" />
							<html:option value="${id}">
								<bean:write name="item" property="tenNganh" />
							</html:option>
						</logic:iterate>

					</html:select>
				</div>

				<div class="md-form">
					<label for="form8">He TN</label>
					<html:text property="heTN" styleClass="form-control"></html:text>
				</div>

				<div class="md-form">
					<label for="form8">Ngay TN</label> <input name="ngayTN" type="date"
						class="form-control">
					<!-- THONG BAO LOI SO NGAY TOT NGHIEP NEU BO TRONG HOAC KHONG DU 1 NAM -->
					<html:errors property="loiNgayTN" />
				</div>

				<div class="md-form">
					<label for="form8">Loai TN</label>
					<html:text property="loaiTN" styleClass="form-control"></html:text>
				</div>

				<div class="text-center">
					<html:submit styleClass="btn btn-default" property="hanhDong"
						value="submit">Thêm</html:submit>
					<button type="reset" class="btn btn-warning">Hủy</button>
				</div>
			</div>
		</html:form>
	</div>
</body>

</html>