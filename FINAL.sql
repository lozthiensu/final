
--Tao database = lenh
create database QUANLYSINHVIEN



use QUANLYSINHVIEN


create table TRUONG
(
	MaTruong int identity(1,1), -- Ma truong kieu int, tu dong tang cho de lam
	TenTruong nvarchar(100),
	DiaChi nvarchar(100),
	SoDT nvarchar(11),
	constraint PK_TRUONG primary key (MaTruong) --Cai dat khoa chinh cho bang TRUONG la MaTruong
)
insert into TRUONG(TenTruong, DiaChi, SoDT) values ('PDU', 'Quang Ngai', '0123456789');
insert into TRUONG(TenTruong, DiaChi, SoDT) values ('FTU', 'Da Nang', '0987654321');


create table NGANH
(
	MaNganh int identity(1,1), -- Ma truong kieu int, tu dong tang
	TenNganh nvarchar(100),
	LoaiNganh nvarchar(100),
	constraint PK_NGANH primary key (MaNganh) --Cai dat khoa chinh cho bang TRUONG la MaTruong
)
insert into NGANH(TenNganh, LoaiNganh) values('Xay dung', 'XD');
insert into NGANH(TenNganh, LoaiNganh) values('CNTT', 'IT');


create table SINHVIEN
(
	SoCMND nvarchar(20), -- Ma truong kieu int, tu dong tang
	HoTen nvarchar(100),
	Email nvarchar(100),
	SoDT nvarchar(100),
	DiaChi nvarchar(100),
	constraint PK_SINHVIEN primary key (SoCMND) --Cai dat khoa chinh cho bang TRUONG la MaTruong
)


create table TOTNGHIEP
(
	SoCMND nvarchar(20), -- So cmnd kieu nvarchar
	MaTruong int,
	MaNganh nvarchar(100),
	HeTN nvarchar(20),
	NgayTN Date,
	LoaiTN nvarchar(20)
	constraint PK_TOTNGHIEP primary key (SoCMND, MaTruong, MaNganh) --Cai dat khoa chinh cho bang TOTNGHIEP la SoCMND, MaTruong,MaNganh
)



create table CONGVIEC
(
	SoCMND nvarchar(20), -- Ma truong kieu int, tu dong tang
	NgayVaoCongTy Date,
	MaNganh int,
	TenCongViec nvarchar(100),
	TenCongTy nvarchar(100),
	DiaChiCongTy nvarchar(100),
	ThoiGianLamViec nvarchar(100),
	constraint PK_CONGVIEC primary key (SoCMND, NgayVaoCongTy) --Cai dat khoa chinh cho bang TRUONG la MaTruong
)

--Theo de, cai kieu so cmnd la kieu du lieu kieu nhu so dien thoai, do dai co 10 chu so,
--nen kieu du lieu cua no phai la nvarchar. Con may cai ma truong, ma nganh kia khong can thiet nen de kieu int cung duoc, cho khoe.
--int tu dong tang nen khi insert khoe hon



select SINHVIEN.*, TOTNGHIEP.MaNganh as MaNganh, TOTNGHIEP.MaTruong as MaTruong, CONGVIEC.MaNganh as MaNganhCongTy, CONGVIEC.TenCongTy as TenCongTy, CONGVIEC.ThoiGianLamViec as ThoiGianLamViec from SINHVIEN inner join TOTNGHIEP on SINHVIEN.SoCMND = TOTNGHIEP.SoCMND inner join CONGVIEC on CONGVIEC.SoCMND = SINHVIEN.SoCMND


select SINHVIEN.*, TOTNGHIEP.MaNganh as MaNganh, TOTNGHIEP.MaTruong as MaTruong, CONGVIEC.MaNganh as MaNganhCongTy, CONGVIEC.TenCongTy as TenCongTy, CONGVIEC.ThoiGianLamViec as ThoiGianLamViec from SINHVIEN inner join TOTNGHIEP on SINHVIEN.SoCMND = TOTNGHIEP.SoCMND inner join CONGVIEC on CONGVIEC.SoCMND = SINHVIEN.SoCMND where HoTen like '%123%'