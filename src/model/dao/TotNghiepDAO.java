package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.bean.SinhVien;
import model.bean.TotNghiep;
import statics.InfoSQLServer;

public class TotNghiepDAO {

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

	public boolean them(TotNghiep totNghiep) {

		// MO ket noi
		connect();

		// Luu ket qua truy van

		// Luu thong tin account
		try {

			// Cau lenh insert
			String sql = "insert into TOTNGHIEP(SoCMND,MaTruong,MaNganh,HeTN,NgayTN,LoaiTN)" + " VALUES(?,?,?,?,?,?)";
			PreparedStatement pr = connection.prepareStatement(sql);

			// Truyen 7 them so tren cau insert vao
			pr.setString(1, totNghiep.getSoCMND());
			pr.setInt(2, totNghiep.getMaTruong());
			pr.setInt(3, totNghiep.getMaNganh());
			pr.setString(4, totNghiep.getHeTN());
			pr.setString(5, totNghiep.getNgayTN());
			pr.setString(6, totNghiep.getLoaiTN());

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
}
