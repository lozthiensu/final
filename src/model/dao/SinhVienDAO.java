package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.CongViec;
import model.bean.SinhVien;
import model.bean.SinhVienNangCao;
import model.bean.Truong;
import statics.InfoSQLServer;

public class SinhVienDAO {

	// Neu can thi sua thong tin ket noi csdl tu file InfoSQLServer.java
	String url = InfoSQLServer.url;
	String userName = InfoSQLServer.userName;
	String password = InfoSQLServer.password;
	Connection connection;

	void connect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("JDBC loi");
		}
	}

	public boolean them(SinhVien sinhVien) {

		// Mo ket noi
		connect();

		try {

			// Cau lenh insert
			String sql = "insert into SINHVIEN(SoCMND,HoTen,Email,SoDT,DiaChi)" + " VALUES(?,?,?,?,?)";
			PreparedStatement pr = connection.prepareStatement(sql);

			// Truyen 6 them so tren cau insert vao tuong ung voi 6 dau ?
			pr.setString(1, sinhVien.getSoCMND());
			pr.setString(2, sinhVien.getHoTen());
			pr.setString(3, sinhVien.getEmail());
			pr.setString(4, sinhVien.getSoDT());
			pr.setString(5, sinhVien.getDiaChi());

			// Thuc hien query, neu thanh cong tra ve true, nguoc lai tra ve
			// false
			if (pr.executeUpdate() >= 0) {
				return true;
			}

			// Dong ket noi
			pr.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	public ArrayList<SinhVien> lietKe() {

		// Mo ket noi
		connect();

		// Luu ket qua truy van
		ResultSet rs = null;

		// Luu danh sach sinh vien tam thoi
		ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();
		try {

			// Cau lenh tim kiem
			String sql = "select * from SinhVien";
			PreparedStatement pr = connection.prepareStatement(sql);

			// Thuc hien query
			rs = pr.executeQuery();

			// Lay ket qua dua vao arraylist sinhViens
			while (rs.next()) {
				sinhViens.add(new SinhVien(rs.getString("SoCMND"), rs.getString("HoTen"), rs.getString("Email"),
						rs.getString("SoDT"), rs.getString("DiaChi")));
			}

			// Dong ket noi
			pr.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sinhViens;
	}

	public ArrayList<SinhVien> lietKe(String tuKhoa) {

		// Mo ket noi
		connect();

		// Luu ket qua truy van
		ResultSet rs = null;

		// Luu danh sach sinh vien tam thoi
		ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();
		try {

			// Vi du tuKhoa = "lequynh"
			tuKhoa = "%" + tuKhoa + "%";
			// Luc nay thu khoa tro thanh "Ì%lequynh%", co hai dau % de tim kiem
			// voi cua lenh like trong sql server

			// Cau lenh tim kiem
			String sql = "select * from SinhVien where HoTen like ?";

			PreparedStatement pr = connection.prepareStatement(sql);

			// Truyen tham so tuKhoa vao
			pr.setString(1, tuKhoa);

			// Thuc hien query
			rs = pr.executeQuery();

			// Lay ket qua dua vao arraylist sinhViens
			while (rs.next()) {
				sinhViens.add(new SinhVien(rs.getString("SoCMND"), rs.getString("HoTen"), rs.getString("Email"),
						rs.getString("SoDT"), rs.getString("DiaChi")));
			}

			// Dong ket noi
			pr.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sinhViens;
	}

	public ArrayList<SinhVienNangCao> lietKeNangCao() {

		// Mo ket noi
		connect();

		// Luu ket qua truy van
		ResultSet rs = null;

		// Luu danh sach sinh vien tam thoi
		ArrayList<SinhVienNangCao> sinhViens = new ArrayList<SinhVienNangCao>();
		try {

			// Cau lenh tim kiem
			String sql = "select SINHVIEN.*, TOTNGHIEP.MaNganh as MaNganh, TOTNGHIEP.MaTruong as MaTruong, CONGVIEC.MaNganh as MaNganhCongTy, CONGVIEC.TenCongTy as TenCongTy, CONGVIEC.ThoiGianLamViec as ThoiGianLamViec from SINHVIEN inner join TOTNGHIEP on SINHVIEN.SoCMND = TOTNGHIEP.SoCMND inner join CONGVIEC on CONGVIEC.SoCMND = SINHVIEN.SoCMND";
			PreparedStatement pr = connection.prepareStatement(sql);

			// Thuc hien query
			rs = pr.executeQuery();

			// Lay ket qua dua vao arraylist sinhViens
			while (rs.next()) {
				sinhViens.add(new SinhVienNangCao(rs.getString("SoCMND"), rs.getString("HoTen"), rs.getInt("MaNganh"),
						rs.getInt("MaTruong"), rs.getInt("MaNganhCongTy"), rs.getString("TenCongTy"),
						rs.getString("ThoiGianLamViec")));
			}

			// Dong ket noi
			pr.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sinhViens;
	}

	public ArrayList<SinhVienNangCao> lietKeNangCao(String tuKhoa) {

		// MO ket noi
		connect();

		// Luu ket qua truy van
		ResultSet rs = null;

		// Luu danh sach sinh vien tam thoi
		ArrayList<SinhVienNangCao> sinhViens = new ArrayList<SinhVienNangCao>();
		try {

			// Vi du tuKhoa = "lequynh"
			tuKhoa = "%" + tuKhoa + "%";
			// Luc nay thu khoa tro thanh "Ì%lequynh%", co hai dau % de tim kiem
			// voi cua lenh like trong sql server

			// Cau lenh tim kiem
			String sql = "select SINHVIEN.*, TOTNGHIEP.MaNganh as MaNganh, TOTNGHIEP.MaTruong as MaTruong, CONGVIEC.MaNganh as MaNganhCongTy, CONGVIEC.TenCongTy as TenCongTy, CONGVIEC.ThoiGianLamViec as ThoiGianLamViec from SINHVIEN inner join TOTNGHIEP on SINHVIEN.SoCMND = TOTNGHIEP.SoCMND inner join CONGVIEC on CONGVIEC.SoCMND = SINHVIEN.SoCMND where HoTen like ?";
			PreparedStatement pr = connection.prepareStatement(sql);

			// System.out.println(sql);

			// Truyen tham so tuKhoa vao
			pr.setString(1, tuKhoa);

			// Thuc hien query
			rs = pr.executeQuery();

			// Lay ket qua dua vao arraylist truongs
			while (rs.next()) {
				sinhViens.add(new SinhVienNangCao(rs.getString("SoCMND"), rs.getString("HoTen"), rs.getInt("MaNganh"),
						rs.getInt("MaTruong"), rs.getInt("MaNganhCongTy"), rs.getString("TenCongTy"),
						rs.getString("ThoiGianLamViec")));
				System.out.println("Co ket qua");
			}

			// Dong ket noi
			pr.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sinhViens;
	}

}
